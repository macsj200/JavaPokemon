package gui;

import java.util.ArrayList;
import java.util.Arrays;

import javapokemon.Pokemon;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class PartySelectorModel extends AbstractListModel implements ComboBoxModel {
	private String selected = null;
	private Pokemon selectedPokemon = null;
	private ArrayList<Pokemon> party = null;
	
	public PartySelectorModel(ArrayList<Pokemon> party){
		this.party = party;
	}
	@Override
	public Object getElementAt(int arg0) {
		return party.get(arg0);
		
	}

	@Override
	public int getSize() {
		return party.size();
		
	}

	@Override
	public Object getSelectedItem() {
		return selected;
		
	}

	@Override
	public void setSelectedItem(Object arg0) {
		selectedPokemon = (Pokemon) arg0;
	}



}
