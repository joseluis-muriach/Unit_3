import java.util.Scanner;

public class Example24 {
    public static void main(String[] args) {

        int number = 0;
        long multiplication = 1;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        number = value.nextInt();

        for (int i = number; i > 0; i--) {
            multiplication *= i;
        }
        System.out.println("The factorial of " + number + " is: " + multiplication);

        //Tambien podriamos hacerlo asi:
        for (int i = 1; i >= number; i++) {
            multiplication *= i;
        }
        System.out.println("The factorial of " + number + " is: " + multiplication);
    }
}
