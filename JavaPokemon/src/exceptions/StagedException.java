package exceptions;

import javapokemon.Pokemon;

public class StagedException extends Exception {
	private Pokemon pokemon = null;
	
	public StagedException(Pokemon pokemon){
		super();
		this.setPokemon(pokemon);
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}
