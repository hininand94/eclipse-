package userdefined;

import java.util.Scanner;

public class Squareandcube 
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int num, square, cube;

	        System.out.print("Enter number: ");
	        num = sc.nextInt();

	        square = num * num;
	        cube = num * num * num;

	        System.out.println("Square = " + square);
	        System.out.println("Cube = " + cube);
}
 }