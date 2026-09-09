package forloops;
import java.util.scanner
public class Adult {
	public static void main(String[] args) {
             
		scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Person is Adult");
        }
    }
}
}
