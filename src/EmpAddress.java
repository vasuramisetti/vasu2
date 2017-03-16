
public class EmpAddress extends Employee {


	 private String street;
	 private int apt;
	 private String city;
	 private int zip;
	 private String state;
	
	 EmpAddress(String name, String designation, int id,String street,int apt,String city,int zip,String state) 
	 	{
			super(name, designation, id);
		
			this.street=street;
			this.apt=apt;
			this.city=city;
			this.zip=zip;
			this.state=state;
			
		}
	 

	 
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getApt() {
		return this.apt;
	}

	public void setApt(int apt) {
		this.apt = apt;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return this.zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	 void methodd()
	 {
		
		 	System.out.println("---------Employee Address---------");
			System.out.println("Street Address:"+getStreet()); 
			System.out.println("Apartment:"+getApt());
			System.out.println("City:"+getCity());
			System.out.println("Zip Code Is:"+getZip());
			System.out.println("State:"+getState());
			
		
	 }

}
