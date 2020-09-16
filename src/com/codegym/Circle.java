package com.codegym;

public class Circle {
    private double radius = 2.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        return "ban kinh " + this.radius
                + " color " + this.color
                + " dien tich " + area();
    }
}
