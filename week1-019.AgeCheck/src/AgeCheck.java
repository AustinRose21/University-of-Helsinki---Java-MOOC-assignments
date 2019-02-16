
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int ageOne = reader.nextInt();

        if(ageOne >= 0 && ageOne < 121){
            System.out.println("OK");
        }
        else{
            System.out.println("Impossible!");
        }
    }
}
