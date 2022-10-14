public class Main {
    public static void main(String[] args) {

        System.out.println("Employee Information\n");

        Employee employee = new Employee("Ahmet Çelik ", 1000, 50, 2008);
        System.out.println(employee.getName() + "\nSalary: " + employee.getSalary() + "\nWork hours: " + employee.getWorkHours() + "\nHire year:" + employee.getHireYear());
        employee.bonus();
        employee.tax();
        employee.raiseSalary();

        System.out.println();

        Employee employee1 = new Employee("Ezgi Gümüş", 800, 40, 2013);
        System.out.println(employee1.getName() + "\nSalary :" + employee1.getSalary() + "\nWork hours: " + employee1.getWorkHours() + "\nHire year: " + employee1.getHireYear());
        employee1.bonus();
        employee1.tax();
        employee1.raiseSalary();

        System.out.println();

        Employee employee2 = new Employee("Emre Gün", 1200, 70, 2000);
        System.out.println(employee2.getName() + "\nSalary: " + employee2.getSalary() + "\nWork hours: " + employee2.getWorkHours() + "\nHire year: " + employee2.getHireYear());
        employee2.bonus();
        employee2.tax();
        employee2.raiseSalary();


    }
}
