package exceptions;

import javapokemon.Pokemon;

public class FaintedException extends Exception {
	private Pokemon pokemon = null;
	
	public FaintedException(Pokemon pokemon){
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
