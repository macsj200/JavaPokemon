package javapokemon;

import java.awt.image.BufferedImage;

public class Pokemon {
	private String name = null;
	private boolean staged = false;
	private int maxHealth = 100;
	private int currentHealth = 100;
	
	Pokemon(String name){
		this.name = name;
		setStats();
	}

	public boolean isFainted() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean isStaged(){
		return staged;
	}
	
	public void stage(){
		staged = true;
	}
	
	public void destage(){
		staged = false;
	}
	
	private void setStats(){
		// TODO lookup stats from database
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString(){
		return name;
	}

	public BufferedImage getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
}
