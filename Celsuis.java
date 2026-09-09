package userdefined;

import java.util.Scanner;
public class Celsuis {
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        float celsius, fahrenheit;

	        System.out.print("Enter Celsius: ");
	        celsius = sc.nextFloat();

	        fahrenheit = (celsius * 9 / 5) + 32;

	        System.out.println("Fahrenheit = " + fahrenheit);
	    }
	}
}
