package forloops;
import java.util.scanner
public class Temperature {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if(temp > 37) {
            System.out.println("Temperature is above normal");
        }
    }
}
}
