package Forloop;
import java.util.scanner;
public class Countdown {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
