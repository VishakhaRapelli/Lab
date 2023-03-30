package com.cognizant.shapes;
public class Rectangle1 {
	private double length;
    private double breadth;
    
    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getArea() {
        return length * breadth;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

public class Rectangle_Test {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(20.0, 40.0);
        double area = rect.getArea();
        System.out.println("Area = " + area);
        
        rect.setLength(30.0);
        rect.setBreadth(30.0);
        double newArea = rect.getArea();
        System.out.println("New area = " + newArea);
    }
    



    