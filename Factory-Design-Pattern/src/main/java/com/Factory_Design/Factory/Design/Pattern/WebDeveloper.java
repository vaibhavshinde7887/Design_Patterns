package com.Factory_Design.Factory.Design.Pattern;

public class WebDeveloper implements Employee {

    public int salary() { // Method to get the salary of a web developer
        System.out.println("Getting web developer salary");
        return 40000;
    }
}
