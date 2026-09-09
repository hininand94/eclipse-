package userdefined;

import java.util.Scanner;

public class ASCIIvalues {
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        char ch;

	        System.out.print("Enter character: ");
	        ch = sc.next().charAt(0);

	        int ascii = ch;

	        System.out.println("ASCII value = " + ascii);
	    }
	}
}
