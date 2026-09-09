package Switchcase;
import java.util.scanner;
public class Restaurantorder {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Restaurant Menu");
	        System.out.println("1. Dosa - Rs.40");
	        System.out.println("2. Idli - Rs.30");
	        System.out.println("3. Poori - Rs.50");
	        System.out.println("4. Pongal - Rs.60");

	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        switch(choice) {
	            case 1:
	                System.out.println("You ordered Dosa. Bill = Rs.40");
	                break;
	            case 2:
	                System.out.println("You ordered Idli. Bill = Rs.30");
	                break;
	            case 3:
	                System.out.println("You ordered Poori. Bill = Rs.50");
	                break;
	            case 4:
	                System.out.println("You ordered Pongal. Bill = Rs.60");
	                break;
	            default:
	                System.out.println("Invalid Choice");
	        }
	    }
	}
}
