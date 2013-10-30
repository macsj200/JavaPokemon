package exceptions;

import javapokemon.Pokemon;

public class NotInPartyException extends Exception {
	private Pokemon pokemon = null;
	
	NotInPartyException(Pokemon pokemon){
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
