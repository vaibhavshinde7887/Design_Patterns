package com.Builder.Pattern.Builder.Design.Pattern;

public class Main {

    public static void main(String[] args) {
        // creating object of User class using builder class
             User user1 = new User.UserBuilder() // creating object of builder class
                .setEmailId("vshinde7887@gmail.com")
                .setUserId("Vaibh143")
                .setUserName("Vaibhav")
                .build(); // calling build method to create object  // we calling this method to create object and
                                                                      // it return new object of User class;
                                                                   // this is object1


        System.out.println(user1);


       User user2 = User.UserBuilder.builder()
                .setEmailId("Aajy@gmail.com")
                .setUserId("Ajay143")
                .setUserName("Ajay")
                .build(); // we create new object2

        System.out.println(user2);
    }
}
