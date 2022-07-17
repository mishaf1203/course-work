public class Employee {
    private String fullName;
    private int sector;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String fullName, int sector, int salary) {
        this.fullName = fullName;
        this.sector = sector;
        this.salary = salary;
        this.id = GetCounter();
        counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getSector() {
        return sector;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int GetCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Ф.И.О: "+getFullName()+" dept. num: " +getSector()+" salary: " +getSalary()+ " id: "+ getId();
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}