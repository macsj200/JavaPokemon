package gui;

import javapokemon.JavaPokemon;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GameWindow extends JFrame { 
	private JComboBox pokemonSelector = null;
	private JavaPokemon gameInstance = null;
	public GameWindow(JavaPokemon gameInstance){
		super("JavaPokemon");
		//Set title of window
		this.gameInstance = gameInstance;
		initComponents();
		addComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	private void initComponents(){
		pokemonSelector = new JComboBox(gameInstance.getPlayer().getParty().toArray());
	}
	private void addComponents(){
		getContentPane().add(pokemonSelector);
		
	}
}
