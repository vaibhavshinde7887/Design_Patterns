package com.Adapter.Pattern.Adapter.Design.Pattern;

public class AdapterCharger implements AppleCharger {


    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone();
        System.out.println(" Your Phone Charging with Adapter charger");

    }
}
