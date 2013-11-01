package javapokemon;

import java.util.ArrayList;

import exceptions.FaintedException;
import exceptions.StagedException;

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
		}
		catch (StagedException e){
		}
	}
	
	public void stagePokemon(Pokemon pokemon) throws FaintedException, StagedException{
		if(stagedPokemon != null){
			stagedPokemon.destage();
		}
		if(pokemon.isFainted()){
			throw new FaintedException(pokemon);
		}
		else if(pokemon.isStaged()){
			throw new StagedException(pokemon);
		}
		else{
			stagedPokemon = pokemon;
			stagedPokemon.stage();
		}
	}
	
	public void populateParty(){
		//Populate the player's party
		
		party.add(new Pokemon("Pikachu"));
		party.add(new Pokemon("Snorlax"));
	}
	
	public ArrayList<Pokemon> getParty() {
		return party;
	}
}
