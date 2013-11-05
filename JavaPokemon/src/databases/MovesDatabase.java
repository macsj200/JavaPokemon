package databases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javapokemon.Move;

public class MovesDatabase {
	private String dataFile = null;
	private BufferedReader reader = null;
	private String line = null;
	private String csvSplitBy = ",";

	public MovesDatabase(String dataFile){
		this.dataFile = dataFile;
	}

	public Move[] getMoves(String pokemonName){
		Move[] moves = new Move[4];
		try {
			reader = new BufferedReader(new FileReader(dataFile));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		try {
			while((line = reader.readLine()) != null){
				if(line.split(csvSplitBy)[0].equals(pokemonName)){
					//Do stuff
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
