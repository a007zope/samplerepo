package LearnSelenium;

public class Array1 {

	
	int []a1 = new int[4];


public static void main(String[] args) {


		Array1 a = new Array1();
		a.m2(a.a1);
	    a.a1[0] =2;
		a.a1[1] =3;
		a.a1[2] =4;
		a.a1[3] =7;

		/*
		 * for(int j=0;j<=a.a1.length;j++) { System.out.println(a.a1[j]); }
		 * 
		 */		//a.m2();

	}


	public void m2(int []a1)
	{
		Array1 a = new Array1();
		{
			for(int i=0;i<=a.a1.length;i++)
			{
				System.out.println(a1[i]);
				System.out.println("m2"+" "+"execution successful");

			}

		}
	}
}

