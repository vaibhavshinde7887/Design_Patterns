package com.Iterator.Pattern.Iterator.Design.Pattern;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user) { // this method adds a user to the userList
        userList.add(user);
    }

    public User getUser(int index) {
        return userList.get(index); // this method returns a user from the userList
    }


    public MyIterator getIterator() {
        return new MyIteratorImpl(userList); // this method returns an instance of MyIterator
    }
}

