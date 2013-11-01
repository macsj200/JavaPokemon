package javapokemon;

import java.util.ArrayList;

import exceptions.FaintedException;

public class Player {
	private ArrayList<Pokemon> party = null;
	//ArrayList that contains party
	
	private Pokemon stagedPokemon = null;
	//Currently staged Pokemon
	
	public Player(){
		party = new ArrayList<Pokemon>();
		populateParty();
		
		try {
			stagePokemon(party.get(0));
		} catch (FaintedException e) {
			System.out.println("That pokemon is fainted!");
		}
	}
	
	public void stagePokemon(Pokemon pokemon) throws FaintedException{
		if(pokemon.isFainted()){
			throw new FaintedException(pokemon);
		}
		else{
			stagedPokemon = pokemon;
		}
	}
	
	public void populateParty(){
		//Populate the player's party
		
		
	}
}
