import java.util.Scanner;

public class Exerecise_secret_number {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100 + 1);
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME AT THE GAME: GUESS A NUMBER");

        do {
            System.out.print("Please, enter the number: ");
            number = sc.nextInt();

            if (number > randomNumber) {
                System.out.println("The secret number is smaller");
                System.out.println();
            } else if (number < randomNumber) {
                System.out.println("The secret number is biggest");
                System.out.println();
            } else if (number == randomNumber) {
                System.out.println("Congratulations, you win!");
            }
        } while (number != -1 && number != randomNumber);
    }
}
