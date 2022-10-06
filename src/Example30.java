import java.util.Scanner;

public class Example30 {
    public static void main(String[] args) {

        int num = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        num = value.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
