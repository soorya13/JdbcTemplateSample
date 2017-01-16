import Model.Employee;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Arun");
		new EmployeeDAO().add(e1);
	}
	
}
