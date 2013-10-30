package javapokemon;

import java.util.ArrayList;

import exceptions.FaintedException;

public class Player {
	private ArrayList<Pokemon> party = null;
	//ArrayList that contains party
	
	private Pokemon stagedPokemon = null;
	//Currently staged Pokemon
	
	public void stagePokemon(Pokemon pokemon) throws FaintedException{
		if(pokemon.isFainted()){
			throw new FaintedException(pokemon);
		}
		else{
			stagedPokemon = pokemon;
		}
	}
}
