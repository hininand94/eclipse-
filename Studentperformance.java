package laddernested;
import java.util.scanner;
public class Studentperformance {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        if(mark >= 90) 
            System.out.println("Excellent");
        
        else if(mark >= 75) 
            System.out.println("Good");
        
        else if(mark >= 50) 
            System.out.println("Average");
        
        else 
            System.out.println("Poor");
}
 }