package staticandNonstatic;

public class Car {
	String name;
	int price;
	String color;
	static int Wheels =4;
	// static is only for class variables
	/*
	 * Static variables  should be the common value 
	 * With Static there would be sequential execution
	 */

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name ="BMW";
		c1.price =60;
		c1.color ="blue";


		Car c2 = new Car();
		c2.name ="Audi";
		c2.price =90;
		c2.color ="white";


		Car c3 = new Car();
		c3.name ="Mercedez";
		c3.price =100;
		c3.color ="Black";


		//How to access static Vars
		//No need to create the Object 
		//	With in the same class you can access directly
		System.out.println(Wheels);

		//you can call by class Name  
		System.out.println(Car.Wheels);

		// Call by  Object Reference
		System.out.println(c1.Wheels);







	}
}
