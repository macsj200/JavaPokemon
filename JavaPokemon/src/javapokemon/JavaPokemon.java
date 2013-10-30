package javapokemon;

public class JavaPokemon {
	private Player player = null;

	public static void main(String[] args) {
		new JavaPokemon();
		//Instantiate itself
	}
	
	public JavaPokemon(){
		player = new Player();
	}

}
