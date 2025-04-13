package com.Prototype.Pattern.Prototype.Design.Pattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    // cloneable is an interface which is used to create a copy of the object
   // it is mainly used in the prototype design pattern
   private String ip;
   private String importantData;
   private List<String> domains = new ArrayList<>();// this is used to store the domains

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryVeryImportantData() throws InterruptedException { // it is load the important data
       this.importantData = "Important data loaded from the network";

       // this is used to load the important data we add the data into the list of domains
       domains.add("www.google.com");
       domains.add("www.facebook.com");
       domains.add("www.twitter.com");
       domains.add("www.instagram.com");


    Thread.sleep(5000);//thisis used to simulate the loading of like when we use this then the output takes a time to load data
       // it will take suppose 5 minutes to load the data

    }

    @Override
    public String toString() {
        // this method is used to print the object
        return this.ip + " : " + this.importantData + " : " + this.domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // this method is used to create a copy/clone of the object
       // logic for cloning the object
        NetworkConnection networkConnection =  new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImportantData(this.importantData);

       for(String d: this.getDomains()){ // we used this for loop to iterate the list of domains
              networkConnection.getDomains().add(d); // this is used to add the domains
       }

        return networkConnection; // this is used to return the cloned object

         // this is example of deep cloning
        // because we are creating a new object and setting the values of the object
    }
}
