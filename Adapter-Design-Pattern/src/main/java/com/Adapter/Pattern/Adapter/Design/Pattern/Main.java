package com.Adapter.Pattern.Adapter.Design.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

//         AppleCharger charger = new ChargerXYZ();
        AppleCharger charger = new AdapterCharger(new DKCharger()); // This is the adapter
        // Create an instance of the AppleCharger
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();
    }
}
