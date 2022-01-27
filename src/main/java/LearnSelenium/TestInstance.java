package LearnSelenium;

public class TestInstance {

	static Instance a ,b,c;

	public static void main(String[] args) {

		Instance  a = new Instance();
		Instance b = new Instance();
		Instance c = new Instance();
		
		a.setSong("hanumanchalisa");
		a.setSingerName("Aditya");
		b.setSong("aartisangraha");
		b.setSingerName("HimeshReshammiya");
		
		a.play();
		b.play();

		/*a.playMusic("Hanuman Chalisa","Aditya");
		b.playMusic("Beautiful","Akon");
		c.playMusic("Hanuman chalisa","Aditya");*/


	}

}
