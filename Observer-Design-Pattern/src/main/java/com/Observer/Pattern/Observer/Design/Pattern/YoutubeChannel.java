package com.Observer.Pattern.Observer.Design.Pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel  implements Subject {

    List<Observer> suscribers = new ArrayList<>();


    @Override
    public void subscribe(Observer ob) {
        this.suscribers.add(ob);

    }

    @Override
    public void unsubscribe(Observer ob) {
        this.suscribers.remove(ob);
    }

    @Override
    public void notifyChanges(String message) {
        for (Observer ob : this.suscribers) {
            ob.notified(message);
        }
    }
}