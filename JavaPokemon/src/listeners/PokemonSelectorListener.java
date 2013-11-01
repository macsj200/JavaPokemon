package listeners;

import javapokemon.Player;
import javapokemon.Pokemon;

import javax.swing.JComboBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import exceptions.FaintedException;
import exceptions.StagedException;

public class PokemonSelectorListener implements ChangeListener {
	private Player player = null;
	
	public PokemonSelectorListener(Player player){
		this.player = player;
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		try {
			player.stagePokemon((Pokemon) ((JComboBox) arg0.getSource()).getSelectedItem());
		} catch (FaintedException e) {
			System.out.println("That pokemon is fainted!");
		} catch (StagedException e){
			System.out.println("That pokemon is staged!");
		}
	}

}
