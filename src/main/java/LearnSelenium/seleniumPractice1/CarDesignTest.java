package LearnSelenium.seleniumPractice1;

import java.util.ArrayList;

public class CarDesignTest {

	public static void main(String[] args) {

		CarDesign cdt = new CarDesign(4,"BMW");

		CarDesign cdt1 = new CarDesign(50,45000);


		CarDesign cdt2 = new CarDesign(5,"dual Stroke",'y');

		System.out.println(cdt.carType);

		System.out.println(cdt2.typeOfEngine+ " "+cdt2.isAvailable);

		ArrayList<String> feature = new ArrayList<String>();
		feature.add("Rear Camera");
		feature.add("Oled TouchScreen Display");
		feature.add("Sunroof");
		feature.add("Dual Ac Feature");
		feature.add("BulletProof wallShield");


		CarDesign audi = new CarDesign("Auddii",4,"Four Stroke","four wheeler",4500000,12.5,5,'y',feature);

		System.out.println(audi.featureList+" "+audi.carName+" "+audi.carType+" "+audi.typeOfEngine+" "+audi.noOfGears);



		String aditya =feature.get(0).toString();

		System.out.println(aditya);



	}





}
