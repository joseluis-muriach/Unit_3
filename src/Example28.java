import java.util.Scanner;

public class Example28 {
    public static void main(String[] args) {

        int numberA = 0;
        int numberB = 0;
        int result = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        numberA = value.nextInt();

        System.out.print("Introduce other number: ");
        numberB = value.nextInt();

        for (int i = 1; i <= numberB; i++) {
            result += numberA;
        }
        System.out.println("Your result is: " + result);
    }
}
