package com.Factory_Design.Factory.Design.Pattern;

public class EmployeeFactory { // Factory class to return the object of Employee

    // Method to get the object of Employee
    public static Employee getEmployee(String employeeType) { // this is use for which employee we want like which type of employee

        if (employeeType.trim().equalsIgnoreCase("Android Developer")) { // if we want android developer
            return new AndroidDeveloper();
        } else if (employeeType.trim().equalsIgnoreCase("Web Developer")) { // if we want web developer
            return new WebDeveloper();

        } else {
            return null;
        }
    }
}
 // this class have the method like who return the object of any class based on the requirement
