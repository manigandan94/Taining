package TraingAqua;

public class Employee2 extends Employee1
{
	public Employee2()
	{
		System.out.println("Constructor Method");
	}
    public static void main(String[] args) 
    {  
    	Employee2 obj= new Employee2();
        obj.setName("Mani");
        obj.setEmpno(2959);
        System.out.println("EmpName:" +obj.getName());
        System.out.println("Rollno:" +obj.getEmpno());
        
     }
}
 
/* output:
	
	Constructor Method
	EmpName:Mani
	Rollno:2959
*/