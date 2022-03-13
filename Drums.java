package RandMusic;

public class Drums extends Musical{
	 private String name="drums";
     private boolean hasKeys=false;
     private boolean hasStrings=false;
     public void sound() {
   	  System.out.println("I'm playing the "+name);
     }
	public Drums(String name, boolean hasKeys, boolean hasStrings) {
		
        this.name=name;
        this.hasKeys=hasKeys;
        this.hasStrings = hasStrings;
	}
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
     
}
