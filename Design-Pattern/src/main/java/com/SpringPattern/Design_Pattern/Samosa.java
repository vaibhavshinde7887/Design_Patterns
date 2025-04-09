package com.SpringPattern.Design_Pattern;

public class Samosa {


    // Lazy way of creating singleton object
    private static Samosa samosa; //we create a variable of the class

    // Constructor call when object create
    private Samosa() { // constructor is private allows only one instance

    }


    // Lazy way of creating single object
    public static Samosa getSamosa() { // it method associated with the class
      // it is create the object of the class
//        Samosa samosa = new Samosa(); // create the object of the class
//        if it is call every time it will create the new object that why we use singleton pattern in down line

         if(samosa == null) {// if samosa is null it means no object in the samosa then create the object
             synchronized (Samosa.class) { // this is synchronized block we use to make it thread safe
                 if (samosa == null) {
                     samosa = new Samosa(); // if it is not null then it will return the same object
                 }
             }
         }
        return samosa;
    }

    //in line No 16 we use synchronized keyword to make it thread safe it run only one thread at a time this is use of synchronized keyword
}

