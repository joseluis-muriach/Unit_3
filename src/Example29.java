import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {

        int numberA = 0;
        int numberB = 0;
        int result = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number (biggest): ");
        numberA = value.nextInt();

        System.out.print("Introduce other number: ");
        numberB = value.nextInt();


        for (int i = numberA; i >= 0; i -= numberB) {
            result = i;
        }
        System.out.println(result);
    }
}
