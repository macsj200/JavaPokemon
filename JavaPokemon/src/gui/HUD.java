package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javapokemon.Pokemon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HUD extends JPanel {
	private PokemonSprite sprite = null;
	private HealthBar healthBar = null;
	private Pokemon pokemon = null;
	
	public HUD(Pokemon pokemon){
		this.pokemon = pokemon;
	}
	
	private void initComponents(){
		sprite = new PokemonSprite(pokemon.getSprite());
		healthBar = new HealthBar();
	}
	
	private void addComponents(){
		add(sprite);
		add(healthBar);
	}
	
	private class HealthBar extends JPanel{
		
	}
	
	private class PokemonSprite extends JPanel{
		private BufferedImage image = null;
		
		PokemonSprite(BufferedImage image){
			this.image = image;
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.drawImage(image, null, 0, 0);
			
			g2d.dispose();
		}
	}
}
