package solution2;

class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double incomeTaxAmount = salary * Taxable.incomeTax;
        System.out.println("Solution2.Employee Income Tax: $" + incomeTaxAmount);
    }
}
