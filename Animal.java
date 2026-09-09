package Polymorphism;
import java.util.Scanner;
public class Animal {
	    void sound() {
	        System.out.println("Animal makes sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter 1 for Animal");
	        System.out.println("Enter 2 for Dog");
	        System.out.print("Choice: ");
	        int choice = sc.nextInt();

	        Animal a;

	        if (choice == 1) {
	            a = new Animal();
	        } else {
	            a = new Dog();
	        }

	        a.sound();
	    }
	}

