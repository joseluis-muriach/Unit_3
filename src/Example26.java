import java.util.Scanner;

public class Example26 {
    public static void main(String[] args) {

        int number = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        number = value.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
