package app;

import company.Company;
import staff.Buyer;
import staff.DepartmentManager;
import staff.Seller;

public class App {

	public static void main(String[] args) {
		
		Company company1 = new Company("Die Firma");
		
		DepartmentManager vm = new DepartmentManager("Leiter Verkauf", 38, company1, "Verkauf");
		company1.addManager(vm);
		
		Seller sale1 = new Seller("Hans Verkaufer", 41, company1);
		vm.addEmployee(sale1);
		
		Seller sale2 = new Seller("Andreas Verkaufer", 23, company1);
		vm.addEmployee(sale2);
		
		DepartmentManager em = new DepartmentManager("Leiter Einkauf", 38, company1, "Einkauf");
		company1.addManager(em);
		
		Buyer purc1 = new Buyer("Hans Einkauf", 41, company1);
		em.addEmployee(purc1);
		
		Buyer purc2 = new Buyer("Andreas Einkauf", 23, company1);
		em.addEmployee(purc2);

		Company company2 = new Company("Firma 2");

		//Company.move(em, company1, company2);

		System.out.println("Company1 Staff");
		company1.showStaff();

//		System.out.println("Company2 Staff");
//		company2.showStaff();
		
		//System.out.println(vm.calcSalary());
		//System.out.println(purc1.calcSalary());
		
		company1.getSalarySum();
		System.out.println("Gehaelter Total: " + company1.getSalarySum());
		System.out.printf("Gehaelter Durchschnitt: %.2f%n", company1.getSalaryAvg());

		System.out.println("Gehaelter Einkauf Total: " + company1.getDivSalarySum("Einkauf"));
		System.out.printf("Gehaelter Einkauf Durchschnitt: %.2f%n", company1.getDivSalaryAvg("Einkauf"));

		System.out.println("Gehaelter Verkauf Total: " + company1.getDivSalarySum("Verkauf"));
		System.out.printf("Gehaelter Verkauf Durchschnitt: %.2f%n", company1.getDivSalaryAvg("Verkauf"));

	}

}
