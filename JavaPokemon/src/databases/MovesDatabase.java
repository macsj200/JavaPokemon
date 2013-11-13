package databases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import exceptions.NoMoveException;
import javapokemon.Move;

public class MovesDatabase {
	private String dataFile = null;
	private BufferedReader reader = null;
	private String line = null;
	private String csvSplitBy = ",";
	private MovesFactory factory = null;

	public MovesDatabase(String dataFile){
		this.dataFile = dataFile;
		factory = new MovesFactory();
	}

	public Move[] getMoves(String pokemonName){
		Move[] moves = new Move[4];
		String[] splitLine = null;
		
		try {
			reader = new BufferedReader(new FileReader(dataFile));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		try {
			while((line = reader.readLine()) != null){
				splitLine = line.split(csvSplitBy);
				
				if(splitLine[0].equals(pokemonName)){
					try {
						moves[0] = factory.makeMove(splitLine[1]);
						
					} catch (NoMoveException e) {
						System.out.println("There isn't a move for that yet");
					}
					
					try {
						moves[1] = factory.makeMove(splitLine[2]);
					} catch (NoMoveException e) {
						System.out.println("There isn't a move for that yet");
					}
					try {
						moves[2] = factory.makeMove(splitLine[3]);
					} catch (NoMoveException e) {
						System.out.println("There isn't a move for that yet");
					}
					try {
						moves[3] = factory.makeMove(splitLine[4]);
					} catch (NoMoveException e) {
						System.out.println("There isn't a move for that yet");
					}
					
				}
			}
		} catch (IOException e) {
			System.out.println("Couldn't read file");
		}
		
		try {
			reader.close();
		} catch (IOException e) {
			System.out.println("Couldn't close file");
		}
		return null;
	}
}
