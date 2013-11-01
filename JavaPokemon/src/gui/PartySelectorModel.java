package gui;

import java.util.ArrayList;

import javapokemon.Pokemon;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class PartySelectorModel extends AbstractListModel implements ComboBoxModel {
	private String[] partyNames = null;
	private String selection = null;
	private ArrayList<Pokemon> party = null;
	
	public PartySelectorModel(ArrayList<Pokemon> party){
		this.party = party;
		partyNames = new String[party.size()];
		for(int i = 0; i < party.size(); i++) {
			partyNames[i] = party.get(i).getName();
		}
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
		return selection;
		
	}

	@Override
	public void setSelectedItem(Object arg0) {
		selection = ((Pokemon) arg0).getName();
		
	}



}
