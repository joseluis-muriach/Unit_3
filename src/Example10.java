import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        int numA = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        numA = inputValue.nextInt();

        if (numA >= 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }
    }
}
