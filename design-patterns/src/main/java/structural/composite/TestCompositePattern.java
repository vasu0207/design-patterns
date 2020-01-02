package structural.composite;

public class TestCompositePattern {

    public static void main(String[] args) {
    System.out.println("Entered Main");
        Developer dev = new Developer("1","dev1","Sr.Dev");
        Developer dev2 = new Developer("2","dev2","Sr.Dev");
        CompanyDirectory devDir = new CompanyDirectory();
        devDir.addEmployee(dev);
        devDir.addEmployee(dev2);

        Manager manager = new Manager("1","dev1","Sr.Dev");
        Manager manager1 = new Manager("2","dev2","Sr.Dev");
        CompanyDirectory managerDir = new CompanyDirectory();
        devDir.addEmployee(manager);
        devDir.addEmployee(manager1);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(managerDir);
        directory.addEmployee(devDir);

        directory.getEmployeeDetails();

        System.out.println("Exist Main");
    }
}
