package gui;

import javapokemon.JavaPokemon;
import javapokemon.Pokemon;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import listeners.PokemonSelectorListener;

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
		pack();
		setVisible(true);
		
	}
	private void initComponents(){
		pokemonSelector = new JComboBox(gameInstance.getPlayer().getParty().toArray());
		pokemonSelector.addActionListener(new PokemonSelectorListener(gameInstance.getPlayer()));
	}
	private void addComponents(){
		getContentPane().add(pokemonSelector);
		
	}
}
