
public class EmpAddress extends Employee {

	 String street;
	 int apt;
	 String city;
	 int zip;
	 String state;
	
	EmpAddress(String name, String designation, int id,String street,int apt,String city,int zip,String state) {
		super(name, designation, id);
	
		this.street=street;
		this.apt=apt;
		this.city=city;
		this.zip=zip;
		this.state=state;
		
	}
	
	 void methodd(){
		
		   System.out.println("---------Employee Address---------");
			System.out.println("Street Address:"+street); 
			System.out.println("Apartment:"+apt);
			System.out.println("City:"+city);
			System.out.println("Zip Code Is:"+zip);
			System.out.println("State:"+state);
			
		
	}

}
