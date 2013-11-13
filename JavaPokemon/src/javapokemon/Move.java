package javapokemon;

public class Move {
	private String type;
	private int power;
	private float accuracy;
	
	public Move(String moveType, int movePower, float moveAccuracy) {
		type = moveType;
		power = movePower;
		accuracy = moveAccuracy;
	}
}
