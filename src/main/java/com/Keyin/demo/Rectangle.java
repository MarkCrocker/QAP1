package com.Keyin.demo;

public class Rectangle {

    // Atributes
    private float length;
    private float width;
    private double area;
    private double perimeter;

    // Methods
    Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public  float getLength() {
        return length;
    }

    public  void setLength(float l) {
        this.length = l;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public double getArea() {
        return (length * width);

    }

    public double getPerimeter() {
        return (2 * (length + width));
    }

}