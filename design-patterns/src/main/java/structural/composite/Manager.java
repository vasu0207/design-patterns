package structural.composite;
//@LEAF
public class Manager implements Employee {
    private String name;
    private String empId;
    private String position;

    public Manager(String empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println(name +"-" + empId);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
