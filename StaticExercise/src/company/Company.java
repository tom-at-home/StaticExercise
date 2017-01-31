package company;

import java.util.ArrayList;

import staff.DepartmentManager;
import staff.Employee;
import staff.Seller;

public class Company {
	
	private String name;
	private ArrayList<DepartmentManager> manager = new ArrayList<>();
	
	public Company(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addManager(DepartmentManager manager){
		this.manager.add(manager);
	}
	
	public void removeManager(DepartmentManager manager){
		this.manager.remove(manager);
	}
	
	public void showStaff(){
		
		for (int manager = 0; manager < this.manager.size(); manager++){
			
			DepartmentManager currMan = this.manager.get(manager);
			
			System.out.println(currMan.getName());
			
			for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++){
				
				Employee currEmp = this.manager.get(manager).getEmployees().get(emp);
				
				System.out.println("\t" + currEmp.getName());
				
			}
			
		}
		
	}
	
	public void getSalarySum(){
		
		for (int manager = 0; manager < this.manager.size(); manager++){
			
			DepartmentManager currMan = this.manager.get(manager);
			
			System.out.println(currMan.getName());			
			System.out.println(currMan.calcSalary());
			
			for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++){
				
				Employee currEmp = this.manager.get(manager).getEmployees().get(emp);
				
				System.out.println("\t" + currEmp.getName());
				if(currEmp instanceof Seller){
					System.out.println("\t" + ((Seller) currEmp).calcSalary());
				}
			}
			
		}
		
	}
	
	public void getSalaryAvg(){
		
	}
	
}
