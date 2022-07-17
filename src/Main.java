public class Main {

    public static void allEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static int sum(Employee[] employee) {
        int sum = 0;
        int salary = 0;
        for (int i = 0; i < employee.length; i++) {
            salary = employee[i].getSalary();
            sum += employee[i].getSalary();

        }
        System.out.println("Сумма зарплат "+sum);
        return sum;
    }
    public static void countMin(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees
            ) {
                if (emp.getSalary() > employee.getSalary())
                emp = employee;
            }
            System.out.println("Мин. "+emp.getSalary()+" " + emp.getFullName()+" " + emp.getId());
        }else
            System.out.println("Массив пустой");

    }
    public static void countMax(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees
            ) {
                if (emp.getSalary() < employee.getSalary())
                    emp = employee;
            }
            System.out.println("Макс. "+emp.getSalary()+" " + emp.getFullName()+" " + emp.getId());
        }else
            System.out.println("Массив пустой");
    }

    public static void avgSalary(Employee[] employees) {
        int sum = sum(employees);
        float avg = (float)sum / employees.length;
        System.out.println("Средняя зп: "+ avg);
    }
    public static void AllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(" Сотрудники:  "+ employee.getFullName());
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
        countMin(employee);
        countMax(employee);
        avgSalary(employee);
        AllStaff(employee);
    }

}