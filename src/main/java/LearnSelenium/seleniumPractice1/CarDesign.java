package LearnSelenium.seleniumPractice1;

import java.util.ArrayList;

public class CarDesign {


	String carName ;
	int noOfSeats;
	String typeOfEngine;
	String carType;

    int price;
	double  mileage;
    int noOfGears;
    char isAvailable;
    ArrayList<String> featureList;
    
    
    public CarDesign(String carName,int noOfSeats,String typeOfEngine,String carType,int price,double mileage,int noOfGears,char isAvailable, ArrayList<String> featureList)
    {
    	this.carName = carName;
    	this.noOfSeats = noOfSeats;
    	this.typeOfEngine =typeOfEngine;
    	this.carType = carType;
    	this.price = price;
    	this.mileage = mileage;
    	this.noOfGears = noOfGears;
    	this.isAvailable = isAvailable;
    	this.featureList = featureList;
    	
    	
    }
    
   public CarDesign(int noOfSeats, String carType)
   {
	   this.noOfSeats =noOfSeats;
	   this.carType = carType;
	   
   }
   
   public CarDesign(double mileage,int price)
   {
	   this.mileage = mileage;
	   this.price = price;
   }
   
   public CarDesign(int noOfGears,String typeOfEngine, char isAvailable)
   
   {
	   this.noOfGears = noOfGears;
	   this.typeOfEngine = typeOfEngine;
	   this.isAvailable = isAvailable;
   }
   
  
		
	

	

}
