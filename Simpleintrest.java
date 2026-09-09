package userdefined;

import java.util.Scanner;

public class Simpleintrest 
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        float p, r, t, si;

	        System.out.print("Enter principal amount: ");
	        p = sc.nextFloat();

	        System.out.print("Enter rate: ");
	        r = sc.nextFloat();

	        System.out.print("Enter time: ");
	        t = sc.nextFloat();

	        si = (p * r * t) / 100;

	        System.out.println("Simple Interest = " + si);
	    }
}
