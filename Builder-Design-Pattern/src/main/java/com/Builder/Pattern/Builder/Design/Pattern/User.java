package com.Builder.Pattern.Builder.Design.Pattern;

public class User {

    private final String userId;  // final means it is immutable
    private final String userName;
    private final String emailId;

    private User( UserBuilder builder){ // this is private constructor
        //initializa
        this.userId = builder.userId; // using builder class to set the values
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() { // it will retun the output in string format
        return this.userName + " : " + this.emailId + " : " + this.userId;
    }

    // innner class to create object
    static class UserBuilder{ // builder class used to create object

        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder(){ // public constructor use for creating object
        }

        public static UserBuilder builder(){ // we use this for create new object
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) { // using UserBuilder class to set the values
            this.userId = userId;
            return this; // returning the object of builder class using this keyword
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){ // we calling this method to create object and it return new object of User class;
            User user = new User(this);
            return user;
        }
    }
}
