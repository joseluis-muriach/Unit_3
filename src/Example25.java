import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {

        int number = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        number = value.nextInt();

        System.out.println();
        System.out.println("MULTIPLICATION TABLE: " + "'" + number + "'");
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

}
