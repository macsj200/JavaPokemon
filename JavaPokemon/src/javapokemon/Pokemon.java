package javapokemon;

public class Pokemon {
	private String name = null;
	private boolean staged = false;
	
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
	
}
