package LearnSelenium;

public class String1 {


	public static void main(String [] args) {
		// TODO Auto-generated method stub


		String a = "Audi";
		String b ="BMW";

		for(int i =0;i<5;i++)
		{
			if(i==4)
			{
				a=b;
				System.out.println(a);
			}
			else
			{
				System.out.println(a);
			}
		}
	}

}
