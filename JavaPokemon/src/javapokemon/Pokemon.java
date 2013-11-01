package javapokemon;

public class Pokemon {
	private String name = null;
	
	Pokemon(String name){
		this.name = name;
		setStats();
	}

	public boolean isFainted() {
		// TODO Auto-generated method stub
		return false;
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
	
}
