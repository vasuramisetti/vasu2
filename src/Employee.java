
public class Employee {
	
	private String name;
	private String designation;
	private int id;
	
	Employee(String name,String designation, int id){
		
		this.name=name;
		this.designation=designation;
		this.id=id;
		
	}
	
	

	public void setName(String name)
	{
	
		this.name=name;
	
	}

	public String getName()
	{
	
		return this.name;
	}

	public void setId(int id){
	
		this.id=id;
	
	}

	public int getId()
	{
		return this.id;
	}



	public void setDesignation(String designation)
	{
		this.designation=designation;
	
	}

	public String getDesignation()
	{
		return this.designation;
	}
	

	void detailss()
	{
		
		System.out.println("---------Employee Details---------");
		System.out.println("Name:"+getName());
		System.out.println("Id is: "+getId());	
		System.out.println("Designation is: "+getDesignation());
	}


}
