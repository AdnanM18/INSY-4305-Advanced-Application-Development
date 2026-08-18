public class EmployeeApp {
    public static void main(String[] args) {
        // Create 5 Employee objects
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "VP", 89000);
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer", 67000);
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer", 66000);
        Employee employee4 = new Employee("John Doe", 55555, "Sales", "Representative", -35000); // Invalid salary
        Employee employee5 = new Employee("James Blue", 44444, "IT", "CTO", 123000); // Invalid salary

        // Display employee details
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4); // Salary should be 0.0 due to invalid data
        System.out.println(employee5); // Salary should be 0.0 due to invalid data
    }
}