package staff;

import company.Company;

public abstract class Employee {

	private String name;
	private int age;
	private Company company;
	
	public Employee(String name, int age, Company company){
		
		this.name = name;
		this.age = age;
		this.company = company;
		company.employees.add(this);
		
	}

	public abstract float calcSalary();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
