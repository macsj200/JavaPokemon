package databases;

import javapokemon.Move;

public class MovesFactory {

	public Move makeMove(String movesString) throws NoMoveException{
		if(movesString.equals("fire lick")){
			return new Move("Fire", 90 , .95);
		}
		//else ifs
		else{
			throw new NoMoveException();
		}
	}

}
