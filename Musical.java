package RandMusic;

public abstract class Musical {
    private String name;
    private boolean hasKeys;
    private boolean hasStrings;
    public abstract void sound();
	
    
   	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isHasKeys() {
		return hasKeys;
	}


	public void setHasKeys(boolean hasKeys) {
		this.hasKeys = hasKeys;
	}


	public boolean isHasStrings() {
		return hasStrings;
	}


	public void setHasStrings(boolean hasStrings) {
		this.hasStrings = hasStrings;
	}


	public Musical(String name, boolean hasKeys, boolean hasStrings) {
		
		this.name = name;
		this.hasKeys = hasKeys;
		this.hasStrings = hasStrings;
	}

	public Musical() {
		// TODO Auto-generated constructor stub
	}

	
    
}
