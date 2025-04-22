import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee Added Successfully");
    }

    void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employee Found");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    Employee searchEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    boolean deleteEmployee(int id){
        Employee emp = searchEmployee(id);
        if (emp != null){
            employees.remove(emp);
            return true;
        }
        return false;
    }

    boolean updateEmployee(int id,String name,String position,double salary){
        Employee emp = searchEmployee(id);
        if (emp != null){
            emp.setId(id);
            emp.setName(name);
            emp.setPosition(position);
            emp.setSalary(salary);
            return true;
        }
        return false;
    }
}
