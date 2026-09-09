package Nestedif;
import java.util.scanner;
public class Voteeleigibility {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age >= 18) 

            System.out.print("Do you have voter ID (yes/no): ");
            String id = sc.next();

            if(id.equals("yes")) 
                System.out.println("Eligible to Vote");
            }
        }
    
