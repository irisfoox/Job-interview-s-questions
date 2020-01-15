package RandMusic;

public class Piano extends Musical {
   private String name="piano";	
   private boolean hasKeys=true;
   private boolean hasStrings=false;
   public void sound() {
	   System.out.println("I'm playing the "+name);
   }
   
public Piano(String name, boolean hasKeys, boolean hasStrings) {
	this.name = name;
	this.hasKeys = hasKeys;
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
