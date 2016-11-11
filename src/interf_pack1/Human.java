package interf_pack1;

public class Human implements Animals {

	// All the interface methods must be implemented
	@Override
	public void showType() {
		System.out.println("This is of type human");
		
	}

	// The implementing class can also define its own members (variables and methods)
	public void describe(){
		System.out.println("Human beings are the smartest type of animal ");
	}
}
