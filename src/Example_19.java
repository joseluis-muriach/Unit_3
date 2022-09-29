import java.util.Scanner;

public class Example_19 {
    public static void main(String[] args) {

        final double EQUAL_SIX_LESS_SIXTY = 0.95;
        final double EQUAL_SIXTY_OR_MORE = 0.90;

        double price = 0;
        double final_price = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("What is the price? ");
        price = value.nextDouble();

        if (price < 6) {
            final_price = price;
            System.out.println("Sorry you don't have a discount, your total price is: " + final_price);
        } else if (price == 6 || price < 60) {
            final_price = EQUAL_SIX_LESS_SIXTY * price;
            System.out.println("Your total price is: " + final_price);
        } else {
            final_price = EQUAL_SIXTY_OR_MORE * price;
            System.out.println("Your total price is: " + final_price);
        }
    }
}
