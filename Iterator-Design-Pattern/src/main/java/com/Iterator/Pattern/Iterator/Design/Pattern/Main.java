package com.Iterator.Pattern.Iterator.Design.Pattern;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Vaibhav", "JD123"));
        userManagement.addUser(new User("Vittal", "Ja123"));
        userManagement.addUser(new User("Ajay", "Jh123"));
        userManagement.addUser(new User("Brijesh", "lD123"));
        userManagement.addUser(new User("Prasad", "Jk123"));

        MyIterator iterator = userManagement.getIterator(); // this method returns an instance of MyIterator

        while (iterator.hasNext()) { // this method checks if there is a next element
            User user = (User) iterator.next(); // this method returns the next element in the list
            System.out.println("User Name:-> " + user.getName() + ", User ID: " + user.getUserId());

        }
    }
}
