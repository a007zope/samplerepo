
import java.util.ArrayList;

public class ArrayListandArrayDifferencs {

	public static void main(String[] args) {

		ArrayList<Egg> myList = new ArrayList<Egg>();
		Egg s = new Egg();


		Egg b = new Egg();
		myList.add(s);
		myList.add(b);
		for(int i =0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}

		//		// printing ArrayList
		//		for(Egg t : myList)
		//		{
		//			System.out.println(t);
		//		}



		int j =	myList.size();
		//System.out.println(j);

		String [] k = new String[2];
		String a = new String("woohooo");
		k[0]=a;

		String f = new String("real");
		k[1]= f;

		int i =0;
		do {
			System.out.println(myList.get(i));
			i++;
		
		} 
		while (i<myList.size());














	}

}
