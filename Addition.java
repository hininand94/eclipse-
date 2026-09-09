package Polymorphism;

import java.util.Scanner;

public class Addition {
	
	
	    void add(int a, int b) {
	        System.out.println("Sum = " + (a + b));
       } 

	    void add(double a, double b) {
	        System.out.println("Sum = " + (a + b));
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Addition obj = new Addition();

	        System.out.print("Enter two integers: ");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        obj.add(x, y);

	        System.out.print("Enter two decimal numbers: ");
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        obj.add(a, b);
	    }
	}

