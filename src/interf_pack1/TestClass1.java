package interf_pack1;

public class TestClass1 {

	
	
	public static void main (String...args){
		
		//An interface can reference an object of the class that implements it
		Animals an = new Human();
		
		// A reference pointing to the same class's Object
			Human hum = new Human();
			
		// An interface static member must be accessed in a static way as with classes
		 System.out.println(Animals.GENERAL_TYPE);
		 
		 //The interface reference can access a member of the class which object is being referred to only if that 
		 //that member is also contained in the interface.
		  an.showType();
		  
		//This is illegal because the method describe() is not defined in the interface Animal
		//  an.describe()
		
		 //This is normal because the the reference is of type Human
		  hum.describe();
		  
	}
}
