import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // without lambda expression

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable1");
//            }
//        }).start();

        // with lambda expression

        new Thread(()-> {
            System.out.println("Printing from the Runnable2");
            System.out.println("One more statement");
        }).start();

        Employee eli = new Employee("Eli Kaloh", 5);
        Employee joel = new Employee("Joel Berghult", 36);
        Employee iza = new Employee("Iza Audrey", 21);
        Employee anne = new Employee("Anne White", 77);

        List<Employee> employees = new ArrayList<>();
        employees.add(eli);
        employees.add(joel);
        employees.add(iza);
        employees.add(anne);

        // without lambda expression

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });


        // with lambda expression

        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
   private String name;
   private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}