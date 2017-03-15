
public class EmpPersonalDetails  extends Employee{
	
	int age;
	String phoneNumber;
	
	
	EmpPersonalDetails(String name, String designation, int id,int age, String phoneNumber, String street,int apt,String city,int zip,String state) {
		super(name, designation, id);
	
		
		this.age=age;
		this.phoneNumber=phoneNumber;
		
	}

	
	


	public void personall(){
		System.out.println("---------Employee Personal Details---------");
		System.out.println("Age is :"+age); 
		System.out. println("Phone Number:"+phoneNumber);	
		
	}





	

}
