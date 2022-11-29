import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee eli = new Employee("Eli Kaloh", 5);
        Employee joel = new Employee("Joel Berghult", 36);
        Employee iza = new Employee("Iza Audrey", 21);
        Employee anne = new Employee("Anne White", 77);
        Employee stefan = new Employee("Stefan Salvatore", 34);
        Employee damon = new Employee("Damon Salvatore", 37);
        Employee elena = new Employee("Elena Gilbert", 18);



        List<Employee> employees = new ArrayList<>();
        employees.add(eli);
        employees.add(joel);
        employees.add(iza);
        employees.add(anne);
        employees.add(stefan);
        employees.add(damon);
        employees.add(elena);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30); // with lambda expression
        printEmployeesByAge(employees, "\nEmployees over 30", employee -> employee.getAge() <= 30);
        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() { // with anonymous class
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("=============");
        for(Employee employee : employees) {
            if(ageCondition.test(employee)){

                System.out.println(employee.getName());
            }
        }

    }
}