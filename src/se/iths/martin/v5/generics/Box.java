package se.iths.martin.v5.generics;

import se.iths.martin.v2.Person;

import java.util.ArrayList;

public class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
