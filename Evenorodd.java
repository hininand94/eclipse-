package Elsecondition;
import java.util.scanner;
public class Evenorodd {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        if(num % 2 == 0) {
	            System.out.println("Even Number");
	        } else {
	            System.out.println("Odd Number");
	        }
	    }
	}
}
