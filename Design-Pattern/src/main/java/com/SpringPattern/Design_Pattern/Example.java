package com.SpringPattern.Design_Pattern;

public class Example {
    public static void main(String[] args) {

        Samosa samosa1 = Samosa.getSamosa();  // This will call the constructor of Samosa class

        System.out.println(samosa1.hashCode()); // it will return the hashcode of the object samosa1

        Samosa samosa2 = Samosa.getSamosa();  // This will not call the constructor of Samosa class

        System.out.println(samosa2.hashCode());  // it will return the hashcode of the object samosa2

        //if we print the hashcode of both object it will return the same hashcode it means both object are same
        // that means we are using singleton pattern

        // it gives same hashcode
        // 396873410
        // 396873410

        System.out.println(Jalebi.getJalebi().hashCode()); // check the hashcode is same or not
        System.out.println(Jalebi.getJalebi().hashCode());
        // it is same hash code we use Eager way
    }
}


/*
 .always contructor is private
 .object create with the help of Method
 .create field to store object is private
 */