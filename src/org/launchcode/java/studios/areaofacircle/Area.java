package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Enter a radius: ");
       double radius = input.nextDouble();

       //double area = Math.PI * radius *radius;
        double area = Circle.getArea(radius);
       System.out.println("The area of a circle of radius " + radius + " is " + Math.round(area * 1000.0) / 1000.0);
    }
}
