package databases;

import javapokemon.Move;
import exceptions.NoMoveException;

public class MovesFactory {

	public Move makeMove(String movesString) throws NoMoveException{
		if(movesString.equals("Blast Burn")){
			return new Move("Fire", 150 , .90);
		}
		else if(movesString.equals("Inferno")){
			return new Move("Fire", 100 , .50);
		}
		else if(movesString.equals("Flamethrower")){
			return new Move("Fire", 95 , 1.0);
		}
		else if(movesString.equals("Ember")){
			return new Move("Fire", 40 , 1.0);
		}
		else if(movesString.equals("Petal Dance")){
			return new Move("Grass", 120 , 1.0);
		}
		else if(movesString.equals("Frenzy Plant")){
			return new Move("Grass", 150 , .90);
		}
		else if(movesString.equals("Razer Leaf")){
			return new Move("Grass", 55 , .95);
		}
		else if(movesString.equals("Leaf Storm")){
			return new Move("Grass", 40 , .90);
		}
		else if(movesString.equals("Inferno")){
			return new Move("Water", 100 , .50);
		}
		else if(movesString.equals("Inferno")){
			return new Move("Water", 100 , .50);
		}
		else if(movesString.equals("Inferno")){
			return new Move("Water", 100 , .50);
		}
		else if(movesString.equals("Inferno")){
			return new Move("Water", 100 , .50);
		}
		
		//else ifs
		else{
			throw new NoMoveException();
		}
	}

}
