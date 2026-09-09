package Nestedif;
import java.util.scanner;
public class Studentpassed {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();

        if(m1 >= 35) {

            if(m2 >= 35) {
                System.out.println("Passed in both subjects");
            }
}
