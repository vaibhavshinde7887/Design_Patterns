package com.Observer.Pattern.Observer.Design.Pattern;

public class Subsriber implements Observer {

    String name;

   Subsriber(String name) {
       this.name = name;
   }

    @Override
    public void notified(String message) {


        System.out.println("Hello " + this.name + " new video upload : " + message);
    }
}
