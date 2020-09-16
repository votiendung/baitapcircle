package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.14, "yellow", 5.0);
    }
}
