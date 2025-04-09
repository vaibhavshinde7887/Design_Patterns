package com.SpringPattern.Design_Pattern;


public class Jalebi {

    // Eager way of creating singleton object
    private static Jalebi jalebi = new Jalebi(); // create a variable of the class when class load then object create

    public static Jalebi getJalebi() { // it method associated with the class
        return jalebi; // it will return the same object
    }
}

// if eager waty is used then we don't need to check the null value
