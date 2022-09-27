import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        int numA = 0;
        int numB = 0;
        int numC = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Give me the first number: ");
        numA = inputValue.nextInt();

        System.out.print("Give me the second number: ");
        numB = inputValue.nextInt();

        System.out.print("Give me the third number: ");
        numC = inputValue.nextInt();

        if (numA > numB) {
            if (numA > numC) {
                System.out.println(numA);
            } else {
                System.out.println(numC);
            }
        } else if (numA > numC) {
            System.out.println(numB);
        } else if (numB > numC) {
            System.out.println(numB);
        } else {
            System.out.println(numC);
        }
    }
}
