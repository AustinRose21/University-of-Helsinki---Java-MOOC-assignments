
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double numOne = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        double numTwo = Integer.parseInt(reader.nextLine());

        double numTotal = (numOne / numTwo);
        System.out.println("Division " + numOne + " / " + numTwo + " = " + numTotal);
    }
}
