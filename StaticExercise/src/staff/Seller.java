package staff;
import company.Company;

import java.util.ArrayList;

public class Seller extends Employee{

	public Seller(String name, int age, Company company) {
		super(name, age, company);
		
	}

	public float calcSalary(){
		
		float salary = 0;	
		//salary = 1000 * (1 + ((float)this.getAge() / 100));
		salary = 1000;
		return salary;
		
	}
	
	public void doSalesConversation(String conversation){
		
		System.out.println(conversation);
		
	}
	
}
