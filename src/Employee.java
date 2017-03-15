
public class Employee{
	
	String name;
	String designation;
	int id;
	
	
Employee(String name,String designation, int id){
		
		this.name=name;
		this.designation=designation;
		this.id=id;
		
	}
	
	void detailss(){
		
		System.out.println("---------Employee Details---------");
		System.out.println("Name:"+name);	
		    System.out.println("Id is: "+id);
		    System.out.println("Designation is: "+designation);
	}


}
