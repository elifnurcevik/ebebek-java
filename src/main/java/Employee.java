public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void tax() {
        if (salary >= 1000) {
            double payTax = (double) salary * 3 / 100;
            System.out.println("Tax fee you will pay : " + payTax);
        }
    }

    public void bonus() {
        if (workHours > 40) {
            double overtimeFee = (workHours - 40) * 30;
            System.out.println("This week's overtime pay: " + overtimeFee);
        }
    }

    public void raiseSalary() {
        int currentYear = 2021;

        if ((currentYear - hireYear) < 10) {
            int raise = salary / 20;
            int newSalary = raise + salary;
            System.out.println("Your new salary: " + newSalary);
        } else if ((currentYear - hireYear) > 9 && (currentYear - hireYear) < 20) {
            int raise = salary / 10;
            int newSalary = raise + salary;
            System.out.println("Your new salary: " + newSalary);
        } else if ((currentYear - hireYear) > 19) {
            int raise = salary * 3 / 10;
            int newSalary = raise + salary;
            System.out.println("Your new salary: " + newSalary);
        }
    }

    public String toString() {
        return this.getName() + this.getSalary() + this.getHireYear() + this.getWorkHours();
    }

}
