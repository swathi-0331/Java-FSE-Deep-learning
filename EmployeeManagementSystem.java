public class EmployeeManagementSystem {
    static final int MAX_EMPLOYEES = 100;
    static Employee[] employees = new Employee[MAX_EMPLOYEES];
    static int count = 0;

    public static void main(String[] args) {
        // Add employees
        addEmployee(new Employee(101, "Alice", "Developer", 60000));
        addEmployee(new Employee(102, "Bob", "Manager", 80000));
        addEmployee(new Employee(103, "Charlie", "Analyst", 50000));

        // Traverse
        System.out.println("All Employees:");
        traverseEmployees();

        // Search
        System.out.println("\nSearching for Employee with ID 102:");
        searchEmployee(102);

        // Delete
        System.out.println("\nDeleting Employee with ID 101");
        deleteEmployee(101);

        // Traverse again
        System.out.println("\nEmployees after Deletion:");
        traverseEmployees();
        
        // Time complexity discussion
        System.out.println("\nTime Complexity:");
        System.out.println("Add: O(1)");
        System.out.println("Search: O(n)");
        System.out.println("Traverse: O(n)");
        System.out.println("Delete: O(n)");

        System.out.println("\nLimitations:");
        System.out.println("- Fixed size array");
        System.out.println("- Insert/Delete is inefficient (shifting required)");
        System.out.println("- Better alternatives: ArrayList, HashMap for dynamic data");
    }

    public static void addEmployee(Employee emp) {
        if (count < MAX_EMPLOYEES) {
            employees[count++] = emp;
        } else {
            System.out.println("Employee limit reached.");
        }
    }

    public static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public static void searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == empId) {
                // Shift elements to the left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
