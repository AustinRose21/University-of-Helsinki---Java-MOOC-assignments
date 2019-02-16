
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int numOne = reader.nextInt();

        if(numOne < 30){
            System.out.println("Grade: failed");
        }
        else if(numOne < 35){
            System.out.println("Grade: 1");
        }
        else if(numOne < 40){
            System.out.println("Grade: 2");
        }
        else if(numOne < 45){
            System.out.println("Grade: 3");
        }
        else if(numOne < 50){
            System.out.println("Grade: 4");
        }
        else if(numOne < 61){
            System.out.println("Grade: 5");
        }

    }
}
