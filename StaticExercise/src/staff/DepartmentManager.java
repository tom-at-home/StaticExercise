package staff;
import java.util.ArrayList;

public class DepartmentManager extends Employee{

	private ArrayList<Employee> employees = new ArrayList<>();

	public DepartmentManager(String name, int age) {
		super(name, age);
	}
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public float calcSalary(){
		
		float salary = 0;	
		//salary = 2000 * (1 + ((float)this.getAge() / 100));
		salary = 2000;
		return salary;
		
	}
	
	public void addEmployee(Employee employee){
		this.employees.add(employee);
	}
	
	public void removeEmployee(Employee employee){
		this.employees.remove(employee);
	}
	
	
	
	
	
}
