package interf_pack1;

public interface Animals {
	
	// This is just to show that an interface can define a variable which must be static and final
	// the variables even if there are declared STATIC FINAL, there are implicitly static final.
	// Also remeber an interface can not maintain a state information like classes.
	public static final String GENERAL_TYPE = " AMINAL";
	 
	public void showType();
	

}
