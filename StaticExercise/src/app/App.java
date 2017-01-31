package app;

import company.Company;
import staff.DepartmentManager;
import staff.Seller;

public class App {

	public static void main(String[] args) {
		
		Company company = new Company("Die Firma");
		
		DepartmentManager vm = new DepartmentManager("Leiter Verkauf", 38);
		company.addManager(vm);
		
		Seller sale1 = new Seller("Hans Verkaufer", 41);
		vm.addEmployee(sale1);
		
		Seller sale2 = new Seller("Andreas Verkaufer", 23);
		vm.addEmployee(sale2);
		
		DepartmentManager em = new DepartmentManager("Leiter Einkauf", 38);
		company.addManager(em);
		
		Seller purc1 = new Seller("Hans Einkauf", 41);
		em.addEmployee(purc1);
		
		Seller purc2 = new Seller("Andreas Einkauf", 23);
		em.addEmployee(purc2);		
		
		//company.showStaff();
		
		//System.out.println(vm.calcSalary());
		//System.out.println(purc1.calcSalary());
		
		company.getSalarySum();
	}

}
