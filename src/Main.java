public class Main {

    public static void allEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println(" ");
    }

    public static int sum(Employee[] employee) {
        int sum = 0;
        int salary = 0;
        for (int i = 0; i < employee.length; i++) {
            salary = employee[i].getSalary();
            sum += employee[i].getSalary();

        }
        System.out.println(sum);
        return sum;
    }
    public static int countMin(Employee[] employees) {
        if (employees.length > 0) {
            Employee employee = employees[0];
            for (Employee employee : employees
            ) {
                if (employee.getSalary() > employee.getSalary())
                emp = employee;
            }
        }

    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Хорин Сергей Александрович", 1, 43515);
        employee[1] = new Employee("Пупкин Владимир Яковлевич", 3, 55743);
        employee[2] = new Employee("Бобов Михаил Михайлович", 5, 77435);
        employee[3] = new Employee("Иванов Иван Иванович", 4, 88234);
        employee[4] = new Employee("Сергеев Сергей Сергеевич", 1, 23499);
        employee[5] = new Employee("Александров Александр Александрович", 2, 123663);
        employee[6] = new Employee("Дмитриев Дмитрий Дмитриевич", 3, 23465);
        employee[7] = new Employee("Данилов Данила Данилович", 4, 54654);
        employee[8] = new Employee("Антонов Антон Антонович", 5, 65765);
        employee[9] = new Employee("Егоров Егор Егорович", 2, 3456354);
        allEmployee(employee);
        sum(employee);
    }

}