package solution2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee information
        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Yearly Salary:");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);
        employee.calcTax();

        System.out.println("--------------------");

        // Product information
        System.out.println("Enter Product ID:");
        int prodId = scanner.nextInt();
        System.out.println("Enter Product Price:");
        double prodPrice = scanner.nextDouble();
        System.out.println("Enter Product Quantity:");
        int prodQuantity = scanner.nextInt();

        Product product = new Product(prodId, prodPrice, prodQuantity);
        product.calcTax();

        scanner.close();
    }
}