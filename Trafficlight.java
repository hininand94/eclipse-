package laddernested;
import java.util.scanner;
public class Trafficlight {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter light color: ");
        String color = sc.next();

        if(color.equals("red")) {
            System.out.println("Stop");
        }
        else if(color.equals("yellow")) {
            System.out.println("Ready");
        }
        else if(color.equals("green")) {
            System.out.println("Go");
        }
        else {
            System.out.println("Invalid Color");
        }
    }
}
