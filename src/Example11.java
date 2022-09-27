import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        int numA = 0;
        int numB = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Give me the first number: ");
        numA = inputValue.nextInt();

        System.out.print("Give me the second number: ");
        numB = inputValue.nextInt();

        if (numA > numB) {
            System.out.println(numB + ", " + numA + ".");
        } else {
            System.out.println(numA + ", " + numB + ".");
        }
    }
}
