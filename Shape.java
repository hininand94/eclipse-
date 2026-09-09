package Abstraction;
import java.util.Scanner;
	    abstract class Shape {
	    abstract void area(double value);
	}

	class Circle extends Shape {
	    void area(double r) {
	        double a = 3.14 * r * r;
	        System.out.println("Area of Circle = " + a);
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Radius: ");
	        double radius = sc.nextDouble();

	        Circle c = new Circle();
	        c.area(radius);
	    }
	}

