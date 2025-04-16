package com.Iterator.Pattern.Iterator.Design.Pattern;

public class User {

    private String name;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
}
