
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String userName = reader.nextLine();

        System.out.println("Type your password: ");
        String passWord = reader.nextLine();

        if(userName.equals("alex") && passWord.equals("mightyducks")){
            System.out.println("You are now logged into the system!");
        }
        else if(userName.equals("emily") && passWord.equals("cat")){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password is invalid!");
        }
    }
}
