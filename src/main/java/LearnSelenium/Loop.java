package LearnSelenium;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		for (int i=1;i<=10;i++)
		//		{
		//			System.out.println("Hello");
		//			System.out.println(i);
		//		}

		for (int i=1;i<=20;i++)
		{
			if(i%2==0) {
				System.out.println("the number"+i+"is even");
			}
			else if(i%2!=0)
			{
				System.out.println("the number"+i+"is odd");
			}
		}


	}



}
