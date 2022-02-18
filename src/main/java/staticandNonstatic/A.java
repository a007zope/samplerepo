package staticandNonstatic;

public class A {

	public static void main(String[] args) {
		
		// calling b and A mian method will result in to infinite stack and will lead to Stack Overflow error.
		System.out.println("A----Main");
		B.main(args);

	}

}
