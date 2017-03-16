
public class EmpPersonalDetails  extends Employee{
	
		EmpPersonalDetails(String name, String designation, int id,int age, String phoneNumber, String street,int apt,String city,int zip,String state)
		{
		super(name, designation, id);
	
		
		this.age=age;
		this.phoneNumber=phoneNumber;
		
		}
	
		private int age;
		private String phoneNumber;

	

		public void setAge(int age) 
		{
		this.age = age;
		}

		public int getAge() 
		{
		return age;
		}
	
	
		public void setphoneNumber(String phoneNumber) 
		{
		this.phoneNumber = phoneNumber;
		}

		public String getPhoneNumber()
		{
		return phoneNumber;
		}
	


		public void personall()
		{
		System.out.println("---------Employee Personal Details---------");
		System.out.println("Age is :"+getAge()); 
		System.out. println("Phone Number:"+getPhoneNumber());	
		}





	

}
