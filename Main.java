import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    service.addEmployee(new Employee(id, name, position, salary));
                    break;

                case 2:
                    service.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee found = service.searchEmployee(searchId);
                    if (found != null) System.out.println(found);
                    else System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    if (service.deleteEmployee(deleteId))
                        System.out.println("Employee deleted.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Position: ");
                    String newPosition = scanner.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    if (service.updateEmployee(updateId, newName, newPosition, newSalary))
                        System.out.println("Employee updated.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
