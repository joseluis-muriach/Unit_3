import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {

        double n = 0;
        double x = 0;
        double y = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Give me a value: ");
        n = value.nextDouble();
        x = n;

        for (int i = 1; i <= 10; i++) {
            y = 0.5 * (x + n/x);
            if (x % y < 0.000001) {
                x = y;
                System.out.println("Value " + i + " = " + x);
                break;
            } else {
                x = y;
                System.out.println("Value " + i + " = " + x);
            }
        }
    }
}
