import java.util.ArrayList;
import java.util.List;
public class Report {

   /* public static double calculateBudget(Employee employee) {
        return employee.getSubordinates().stream()
                .mapToDouble(Employee::MonthlyPay)
                .sum();
    }

    public static List<Employee> getEmployees(Employee employee) {
        return employee.getSubordinates();
    }

    private static List<Employee> getSubordinates(Employee employee) {
        List<Employee> subordinates = new ArrayList<>();

        if (employee instanceof Director) {
            Director director = (Director) employee;
            subordinates.addAll(director.getManagerList());
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            subordinates.addAll(manager.getStaffList());
        }

        return subordinates;
    }*/
}

