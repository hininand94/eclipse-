package Elsecondition;
import java.util .scanner;
public class Password {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 1234;

        System.out.print("Enter password: ");
        int userPass = sc.nextInt();

        if(userPass == password) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Wrong Password");
        }
    }
}
}
