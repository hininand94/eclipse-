package Forloop;
import java.util.scanner;
public class Squares {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        for(int i = 1; i <= n; i++) {
	            System.out.println("Square of " + i + " = " + (i * i));
	        }
	    }
	}
}
