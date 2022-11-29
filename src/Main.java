import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee eli = new Employee("Eli Kaloh", 5);
        Employee joel = new Employee("Joel Berghult", 36);
        Employee iza = new Employee("Iza Audrey", 21);
        Employee anne = new Employee("Anne White", 77);

        List<Employee> employees = new ArrayList<>();
        employees.add(eli);
        employees.add(joel);
        employees.add(iza);
        employees.add(anne);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }
}