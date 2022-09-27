import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        float nauticalMiles = 0;
        float meters = 1.852f;
        float result = 0f;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Introduce the nautical miles: ");
        nauticalMiles = inputValue.nextFloat();

        result = nauticalMiles * meters;

        System.out.println("is" + result + " meters");
    }
}
