class Employee {

    // Private attributes (Encapsulation)
    private int employeeId;
    private String name;
    private double salary;

    // Constructor
    Employee(int employeeId,
             String name,
             double salary) {

        this.employeeId = employeeId;
        this.name = name;
        setSalary(salary);
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods with validation
    public void setName(String name) {

        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    // Method Overloading (Compile-time Polymorphism)
    public void calculateBonus() {

        System.out.println("Basic Bonus: 5000");
    }

    public void calculateBonus(double percentage) {

        double bonus = salary * percentage / 100;

        System.out.println("Bonus Amount: " + bonus);
    }

    // Method
    public void displayDetails() {

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}

// Manager class using inheritance
class Manager extends Employee {

    private int teamSize;

    // Constructor
    Manager(int id,
            String name,
            double salary,
            int teamSize) {

        super(id, name, salary);

        this.teamSize = teamSize;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void displayDetails() {

        System.out.println("===== Manager Details =====");

        System.out.println("Employee ID : "
                + getEmployeeId());

        System.out.println("Name        : "
                + getName());

        System.out.println("Salary      : "
                + getSalary());

        System.out.println("Team Size   : "
                + teamSize);
    }
}

// Developer class using inheritance
class Developer extends Employee {

    private String programmingLanguage;

    // Constructor
    Developer(int id,
              String name,
              double salary,
              String programmingLanguage) {

        super(id, name, salary);

        this.programmingLanguage =
                programmingLanguage;
    }

    // Method Overriding
    @Override
    public void displayDetails() {

        System.out.println("===== Developer Details =====");

        System.out.println("Employee ID : "
                + getEmployeeId());

        System.out.println("Name        : "
                + getName());

        System.out.println("Salary      : "
                + getSalary());

        System.out.println("Language    : "
                + programmingLanguage);
    }
}

// Main class
public class Question4 {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee e;

        // Manager object
        e = new Manager(
                101,
                "Sabarish",
                75000,
                10
        );

        e.displayDetails();

        e.calculateBonus();

        e.calculateBonus(10);

        System.out.println();

        // Developer object
        e = new Developer(
                102,
                "Ramesh",
                60000,
                "Java"
        );

        e.displayDetails();

        e.calculateBonus();

        e.calculateBonus(15);
    }
}