package structural.composite;
//@LEAF
public class Developer implements Employee {
    private String name;
    private String empId;
    private String position;

    public Developer(String empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println(name +"- "+ empId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
