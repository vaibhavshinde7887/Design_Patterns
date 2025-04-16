package com.Iterator.Pattern.Iterator.Design.Pattern;

import java.util.Iterator;
import java.util.List;

public class MyIteratorImpl implements MyIterator {



    private List<User> list;
    private int length;
    private int position = 0;




    public MyIteratorImpl(List<User> list) {
//        this.iterator = iterator;
        this.list = list;
        this.length = list.size();

    }

    @Override
    public boolean hasNext() { // Check if there is a next element
        if (position >= length) { // this method checks if the position is greater than or equal to the length of the list
            return false;
        } else {
            return true;

        }
    }

    @Override
    public Object next() { // this method returns the next element in the list

        User user = list.get(position); // this method returns the user at the current position
        position++;
        return user;

    }
}
