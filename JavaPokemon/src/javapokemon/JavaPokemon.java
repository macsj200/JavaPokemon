package javapokemon;

import gui.GameWindow;

public class JavaPokemon {
	private Player player = null;

	public static void main(String[] args) {
		JavaPokemon gameInstance = new JavaPokemon();
		//Instantiate itself
		
		gameInstance.start();
	}
	
	public JavaPokemon(){
		player = new Player(); //make a new player
	}
	
	public void start(){
		new GameWindow(this); // Make a new game window instance
	}
}
