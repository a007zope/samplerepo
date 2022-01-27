package LearnSelenium;

public class ArrayPractice {

	public static void main(String[] args) {

		int a[] = new int[4];
		// or 
		//int [] b = new int[4];
		a[0]=1;
		a[1] =56;
		a[2] =78;
		a[3] =89;

		//length - 4
		//hi =length-1
		//li =0

				for(int i=0;i<a.length;i++)
				{
					System.out.println(+i+" "+a[i]);
		
				}

		int i =0;
		for(int e  : a)
		{


			System.out.println(+i+":"+e);

			i++;

		}












	}

}
