
public class MainMethodOverloading {

	public static String [] a = new String[5];


	public static void main(String[] a) {
		a = new String[4];		
		a[0] = "Aditya"; 
		a[1] ="Zope";
		a[2] ="Sr QA Engineer";
		a[3] ="Automation Tester";
		System.out.println("Main 1" +" "+ a[3]);

	}

	public static void main(int a)
	{
		System.out.println(a);
	}

}
