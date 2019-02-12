
import java.util.Scanner;




public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type the radius: ");
        int myInt = reader.nextInt();
        double circumferenceDouble = (2 * Math.PI * myInt);

        System.out.println("Circumference of the circle: " + circumferenceDouble);



    }
}
