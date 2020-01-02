package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements  Employee {
    List<Employee> employees  = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);

    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void getEmployeeDetails() {
        employees.forEach(System.out::print);
    }

    @Override
    public String toString() {
        return "CompanyDirectory{" +
                "employees=" + employees +
                '}';
    }
}
