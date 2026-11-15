package java_tugas_5;

public class Employee implements Compare {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean isLess(Object other) {
        if (other instanceof Employee) {
            Employee employee = (Employee) other;
            return this.salary < employee.salary;
        }
        return false;
    }

    @Override
    public boolean isGreaterThan(Object other) {
        if (other instanceof Employee) {
            Employee employee = (Employee) other;
            return this.salary > employee.salary;
        }
        return false;
    }

    @Override
    public boolean isEqualTo(Object other) {
        if (other instanceof Employee) {
            Employee employee = (Employee) other;
            return Double.compare(this.salary, employee.salary) == 0;
        }
        return false;
    }
}