package com.Prototype.Pattern.Prototype.Design.Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Creating objects using Prototype design");


        NetworkConnection networkConnection1 = new NetworkConnection(); // creating a new network object

        networkConnection1.setIp("192.168.4.4");//setting the ip address
        networkConnection1.loadVeryVeryImportantData();



         // we want new object of network connection
//        NetworkConnection networkConnection2= null;
        try{
         NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone(); // in brackets we are typcasting the object
             NetworkConnection networkConnection3 = (NetworkConnection) networkConnection1.clone(); // in brackets we are typcasting the object


            System.out.println(networkConnection1);


            networkConnection1.getDomains().remove(0);  // this is used to remove the first element from the list of domains
            // this is the exapmple of shallow cloning
            System.out.println(networkConnection1);

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
        } catch(CloneNotSupportedException e){
            e.printStackTrace(); // it is used to print the stack trace of the exception
        }

    }
}
// when we run the code it just take a time to load the first data then basically it clone the data and give u

// the prototype design pattern is used to create a new object by copying the existing object
// in that cloining there are 2 types shallow cloing and deep cloning
