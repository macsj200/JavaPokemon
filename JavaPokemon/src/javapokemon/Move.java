package javapokemon;

public class Move {
	private String type;
	private int power;
	private double accuracy;
	
	public Move(String moveType, int movePower, double d) {
		type = moveType;
		power = movePower;
		accuracy = d;
	}
}
