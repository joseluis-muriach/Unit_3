import java.util.Scanner;

public class Example14 {
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
                if (numB > numC) {
                    System.out.println(numC + ", " + numB + ", " + numA);
                } else {
                    System.out.println(numB + ", " + numC + ", " + numA);
                }
            } else {
                System.out.println(numB + ", " + numA + ", " + numC);
            }
        } else if (numB > numC) {
            if (numA > numC) {
                System.out.println(numC + ", " + numA + ", " + numB);
            } else {
                System.out.println(numA + ", " + numC + ", " + numB);
            }

        } else {
            System.out.println( numA + ", " + numB + ", " + numC);
        }
    }
}
