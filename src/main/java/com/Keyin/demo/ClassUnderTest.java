package com.Keyin.demo;

public class ClassUnderTest {
    private boolean value = false;

    public boolean isTrue() {
        return value;
    }

    public void setValue(boolean valueToSet){
        System.out.println("Setting value to: " + valueToSet);
        value = valueToSet;
    }
}
