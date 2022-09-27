import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        int numA = 0;
        int numB = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce the first value: ");
        numA = value.nextInt();

        System.out.print("Introduce the second value: ");
        numB = value.nextInt();

        System.out.println("The resulkt of your sum is: " + (numA + numB));
        System.out.println("The resulkt of the subtraction is: " + (numA - numB));
        System.out.println("The resulkt of your multiplication is: " + (numA * numB));
        System.out.println("The resulkt of your division is: " + (numA / numB));
    }
}
