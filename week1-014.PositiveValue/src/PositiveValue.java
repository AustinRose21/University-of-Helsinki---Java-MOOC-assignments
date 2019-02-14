
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numOne = reader.nextInt();

        if(numOne > 0){
            System.out.println("The number is positive.");
        }

        else if(numOne <= 0){
            System.out.println("The number is not positive.");
        }


    }
}
