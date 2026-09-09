package Encapisulation;
import java.util.Scanner;

public class Student {
	
	
	    private String name;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Student s = new Student();

	        System.out.print("Enter Name: ");
	        s.setName(sc.nextLine());

	        System.out.println("Name: " + s.getName());
	    }
	}

