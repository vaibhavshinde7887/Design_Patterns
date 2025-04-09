package com.Factory_Design.Factory.Design.Pattern;

public class DeveloperClient {

    // This is the client class that uses the factory to get the employee object

    public static void main(String[] args) {

        // loose coupling
        Employee employee = EmployeeFactory.getEmployee("Android Developer");// the is object// this is use for which employee we want like which type of employee
        System.out.println(employee);
       int salary = employee.salary(); // Get the salary of the employee
        System.out.println("Salary: " + salary); // Print the salary of the employee

        Employee employee1 = EmployeeFactory.getEmployee("Web Developer"); // the is object// this is use for which employee we want like which type of employee
        System.out.println(employee1);
        int salary1 = employee1.salary(); // Get the salary of the employee
        System.out.println("Salary: " + salary1); // Print the salary of the employee
    }
}
 /* it focused on the creation of objects so that the client code does not need to know the details of how the objects are created.
 *The factory pattern is a creational design pattern that provides an interface for creating objects in a superclass,
 *but allows subclasses to alter the type of objects that will be created.
 *It is used when we have a common interface for a group of related classes and
 *we want to create instances of those classes without specifying the exact class to be instantiated.
  */