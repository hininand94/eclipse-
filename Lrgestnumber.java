package laddernested;
import java.util.scanner
public class Lrgestnumber {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(a > b && a > c) {
            System.out.println("A is largest");
        }
        else if(b > c) {
            System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
}
