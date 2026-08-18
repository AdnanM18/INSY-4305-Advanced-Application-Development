public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    private double salary;

    // Constructor with all fields
    public Employee(String name, int idNumber, String department, String position, double salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
        setSalary(salary); // Validate salary
    }

    // Constructor with only name and idNumber
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
        this.salary = 0.0;
    }

    // No-arg constructor
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
        this.salary = 0.0;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        if (salary >= 0 && salary <= 90000) {
            this.salary = salary;
        } else {
            this.salary = 0.0; // Invalid salary set to 0.0
        }
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee Name: " + name + "\nID Number: " + idNumber +
                "\nDepartment: " + department + "\nPosition: " + position +
                "\nSalary: " + salary + "\n";
    }
}