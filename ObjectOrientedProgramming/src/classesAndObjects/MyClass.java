package classesAndObjects;

class MyClass {

	  String colour;
	    private int number;
	    void print()
	    {
	        System.out.println("vehicle");
	    }
	}

	class Car extends MyClass{
	    void print()
	    {
	        System.out.println("car");
	    }
	}
	class Honda extends Car{
	    void print()
	    {
	        System.out.println("Honda");
	    }
	
}