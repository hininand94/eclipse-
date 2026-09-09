package userdefined;
import java.util.Scanner;

public class Studentsnames {
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String name;
	        int marks;

	        System.out.print("Enter student name: ");
	        name = sc.nextLine();

	        System.out.print("Enter marks: ");
	        marks = sc.nextInt();

	        System.out.println("Student Name: " + name);
	        System.out.println("Marks: " + marks);
	    }
	}
}
