package Elsecondition;
import java.util. scanner;
public class Twonumbers {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        if(a > b) {
	            System.out.println("First number is greater");
	        } else {
	            System.out.println("Second number is greater");
	        }
}
