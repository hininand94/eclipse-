package userdefined;
import java.util.Scanner;

public class Average {
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int a,b,c,d,e,sum;
	        float average;

	        System.out.print("Enter 5 numbers: ");

	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();
	        d = sc.nextInt();
	        e = sc.nextInt();

	        sum = a + b + c + d + e;

	        average = sum / 5.0f;

	        System.out.println("Average = " + average);
	    }
	}
}
