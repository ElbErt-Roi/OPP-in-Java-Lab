/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lenovo
 */
class Shape {
    public void area() {
        System.out.println("Area of shape is not defined.");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(10, 5); 
        Shape shape2 = new Rectangle(8, 4); 

      
        shape1.area(); 
        shape2.area(); 
    }
}
