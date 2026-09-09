package Nestedif;
import java.util.scanner;
public class Username {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter password: ");
        String pass = sc.next();

        if(user.equals(username)) {

            if(pass.equals(password)) {
                System.out.println("Login Successful");
            }
        }
}
