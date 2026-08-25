class Employee {
    int id;
    String name;
    String designation;
    String department;
    double salary;

    Employee(int id, String name, String designation,
             String department, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager {

    void calculateSalary(Employee e, String performance) {

        double hrd = e.salary * 0.20;
        double da = e.salary * 0.10;
        double increment = 0;

        if (performance.equalsIgnoreCase("Excellent")) {
            increment = e.salary * 0.20;
        }
        else if (performance.equalsIgnoreCase("Good")) {
            increment = e.salary * 0.10;
        }

        double finalSalary = e.salary + hrd + da + increment;

        e.displayInfo();

        System.out.println("HRD: " + hrd);
        System.out.println("DA: " + da);
        System.out.println("Increment: " + increment);
        System.out.println("Final Salary: " + finalSalary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(
            101,
            "Vishvanth",
            "Software Engineer",
            "CSE",
            50000
        );

        Manager m = new Manager();

        m.calculateSalary(e1, "Excellent");
    }
}