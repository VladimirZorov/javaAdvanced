import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfEmployee = Integer.parseInt(scanner.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();

        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < countOfEmployee; i++) {
            String[] employeeInfo = scanner.nextLine().split(" ");
            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];
            Employee employee = null;
            switch (employeeInfo.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 6:

                    String email = employeeInfo[4];
                    int age = Integer.parseInt(employeeInfo[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
                case 5:
                    if (employeeInfo[4].matches("\\d+")) {
                        int persoAge = Integer.parseInt(employeeInfo[4]);
                        employee = new Employee(name, salary, position, department, persoAge);
                    } else {
                        String personEmail = employeeInfo[4];
                        employee = new Employee(name, salary, position, department, personEmail);
                    }
                    break;
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);
            employees.add(employee);
        }
        System.out.println();


        Department highestPaidDepartment = departmentMap.entrySet().stream()
                .max(Comparator.comparingDouble(e -> e.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.printf("Highest Average Salary: %s", highestPaidDepartment.getName());
    }
}
