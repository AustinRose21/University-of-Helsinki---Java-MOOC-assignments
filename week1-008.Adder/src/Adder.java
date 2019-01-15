
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);





        System.out.println("Type a number: ");
        int numOne = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int numTwo = Integer.parseInt(reader.nextLine());

        int sumNum = (numOne + numTwo);
        System.out.println("Sum of the numbers: " + sumNum);

        // Implement your program here. Remember to ask the input from user
    }
}
