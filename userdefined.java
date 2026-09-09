package userdefined;

import java.util.Scanner;

public class userdefined {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name:");
		String name = sc.nextLine();
		
		System.out.print("Enter age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter you favorite subject:");
		String subject = sc.nextLine();
		
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Favorite Subject:" + subject);

	}

}
