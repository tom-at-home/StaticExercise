package company;

import staff.DepartmentManager;
import staff.Employee;
import staff.Seller;
import staff.Buyer;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<DepartmentManager> manager = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public static void move(Employee employee, Company origin, Company destination) {
//        origin.employees.remove(employee);
//        destination.employees.add(employee);
//    }

    public static void move(DepartmentManager employee, Company origin, Company destination) {
        origin.manager.remove(employee);
        destination.manager.add(employee);
    }

    public void addManager(DepartmentManager manager) {
        this.manager.add(manager);
    }

    public void removeManager(DepartmentManager manager) {
        this.manager.remove(manager);
    }

    public void showStaff() {

        for (int manager = 0; manager < this.manager.size(); manager++) {

            DepartmentManager currMan = this.manager.get(manager);

            System.out.println(currMan.getName());

            for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++) {

                Employee currEmp = this.manager.get(manager).getEmployees().get(emp);

                System.out.println("\t" + currEmp.getName());

            }

        }

    }

    /*public void showStaff(){

        for (Employee employee : this.employees) {
            System.out.println(employee.getName());
        }

    }*/

    public float getSalarySum() {

        float sum = 0;

        for (int manager = 0; manager < this.manager.size(); manager++) {

            DepartmentManager currMan = this.manager.get(manager);

            sum += currMan.calcSalary();

            for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++) {

                Employee currEmp = this.manager.get(manager).getEmployees().get(emp);

                /*if (currEmp instanceof Seller) {
                    sum += ((Seller) currEmp).calcSalary();
                }
                if (currEmp instanceof Buyer) {
                    sum += ((Buyer) currEmp).calcSalary();
                }*/
                sum += currEmp.calcSalary();
            }

        }

        return sum;

    }

    public float getSalaryAvg() {

        float sum = 0;
        int counter = 0;

        for (int manager = 0; manager < this.manager.size(); manager++) {

            DepartmentManager currMan = this.manager.get(manager);
            counter++;

            sum += currMan.calcSalary();

            for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++) {

                Employee currEmp = this.manager.get(manager).getEmployees().get(emp);

                /*if (currEmp instanceof Seller) {
                    sum += ((Seller) currEmp).calcSalary();
                    counter++;
                }
                if (currEmp instanceof Buyer) {
                    sum += ((Buyer) currEmp).calcSalary();
                    counter++;
                }*/
                sum += currEmp.calcSalary();
                counter++;

            }

        }

        return sum / counter;

    }

    public float getDivSalarySum(String division) {

        float sum = 0;

        for (int manager = 0; manager < this.manager.size(); manager++) {

            DepartmentManager currMan = this.manager.get(manager);

            if (currMan.getDivision().equals(division)) {
                //System.out.println(division);
                sum += currMan.calcSalary();

                for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++) {

                    Employee currEmp = this.manager.get(manager).getEmployees().get(emp);

                    /*if (currEmp instanceof Seller) {
                        sum += ((Seller) currEmp).calcSalary();
                    }
                    if (currEmp instanceof Buyer) {
                        sum += ((Buyer) currEmp).calcSalary();
                    }*/
                    sum += currEmp.calcSalary();

                }
            }
        }
        return sum;
    }

    public float getDivSalaryAvg(String division) {

        float sum = 0;
        int counter = 0;

        for (int manager = 0; manager < this.manager.size(); manager++) {

            DepartmentManager currMan = this.manager.get(manager);

            if (currMan.getDivision().equals(division)) {
                //System.out.println(division);

                sum += currMan.calcSalary();
                counter++;

                for (int emp = 0; emp < this.manager.get(manager).getEmployees().size(); emp++) {

                    Employee currEmp = this.manager.get(manager).getEmployees().get(emp);

                    /*if (currEmp instanceof Seller) {
                        sum += ((Seller) currEmp).calcSalary();
                        counter++;
                    }
                    if (currEmp instanceof Buyer) {
                        sum += ((Buyer) currEmp).calcSalary();
                        counter++;
                    }*/
                    sum += currEmp.calcSalary();
                    counter++;
                }
            }
        }
        return sum / counter;
    }

}
