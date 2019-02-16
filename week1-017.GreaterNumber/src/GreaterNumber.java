import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int numOne = reader.nextInt();

        System.out.print("Type the second number: ");
        int numTwo = reader.nextInt();



        if(numOne > numTwo){
            System.out.println("Greater number: " + numOne);
        }

        else if(numTwo > numOne){
            System.out.println("Greater number: " + numTwo);
        }

        else if(numOne == numTwo){
            System.out.println("The numbers are equal!");
        }

    }
}
