
public class ObjectReferenceConcept {

	// class data members
	// static is never a part of your object 

	// class vars
	String name ;
	int age;

	// method
	public void get()
	{
		System.out.println("get Method");

	}
	public static void main(String[] args) {

		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		//		obj = null;
		//		obj.name ="Aditya";
		//		obj.age =25;
		//		System.out.println(obj.name);
		// no reference Objects
		new ObjectReferenceConcept().name ="peter";
		new ObjectReferenceConcept().age =26;
		new ObjectReferenceConcept().get();
	System.gc();
		





	}

}
