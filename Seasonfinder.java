package Switchcase;
impoort java.util.scanner;
public class SeasonFinder {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter month number (1-12): ");
	        int month = sc.nextInt();

	        switch(month) {
	            case 12:
	            case 1:
	            case 2:
	                System.out.println("Winter Season");
	                break;

	            case 3:
	            case 4:
	            case 5:
	                System.out.println("Summer Season");
	                break;

	            case 6:
	            case 7:
	            case 8:
	                System.out.println("Monsoon Season");
	                break;

	            case 9:
	            case 10:
	            case 11:
	                System.out.println("Autumn Season");
	                break;

	            default:
	                System.out.println("Invalid Month");
	        }
	    }
	}
}
