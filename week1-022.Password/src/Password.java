
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        boolean isPasswordValid = false;




        while(!isPasswordValid){
            System.out.println("Type the password: ");
            String passAttempt = reader.nextLine();

            if(passAttempt.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: rabbits eat this!");
                break;
            }
            else{
                System.out.println("Wrong!");
            }

        }
    }
}
