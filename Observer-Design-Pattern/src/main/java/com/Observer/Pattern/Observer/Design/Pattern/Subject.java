package com.Observer.Pattern.Observer.Design.Pattern;

public interface Subject {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void notifyChanges(String message);
}


// it work like you tube channer
