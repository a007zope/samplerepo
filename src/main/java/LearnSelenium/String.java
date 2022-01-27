package LearnSelenium;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		long  startTime = System.currentTimeMillis();
       StringBuffer a = new StringBuffer("Today is Wednesday");

		a.append(" "+"Aditya"+" "+"Zope");

		System.out.println(a);

		a.deleteCharAt(2);
		System.out.println(a);

		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis()-startTime) + "ms" );

		System.out.println(System.currentTimeMillis()-startTime);








	}

}
