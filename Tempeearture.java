package laddernested;
import java.util.scanner;
public class Temperature {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp > 40) {
            System.out.println("Hot");
        }
        else if(temp > 25) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}
}
