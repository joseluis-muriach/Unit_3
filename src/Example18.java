import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {

        final double FIRST_TAX = 0;
        final double SECOND_TAX = 0.75;
        final double THIRD_TAX = 0.55;
        final double THIRTY_FIVE_HOURS = 35;
        final double HOURS_INCREMENT = 1.5;

        double nextThirtyFiveHours = 0;
        double priceHour = 0;
        int hourNumbers = 0;
        double netPay = 0;
        double grossPay = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.print("How many hours did you work?: ");
        hourNumbers = inputValue.nextInt();

        System.out.print("What is the price of a hour? ");
        priceHour = inputValue.nextDouble();

        if (hourNumbers < 36) {
            grossPay = hourNumbers * priceHour;

            if (grossPay > 501 && grossPay < 901) {
                netPay = grossPay * SECOND_TAX;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + SECOND_TAX + "%");
            } else if (grossPay > 901){
                netPay = grossPay * THIRD_TAX;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + THIRD_TAX + "%");
            } else {
                netPay = grossPay;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + FIRST_TAX + "%");
            }
        } else {
            nextThirtyFiveHours = hourNumbers - THIRTY_FIVE_HOURS;
            grossPay = (THIRTY_FIVE_HOURS * priceHour) + (nextThirtyFiveHours * (priceHour * HOURS_INCREMENT));

            if (grossPay > 501 && grossPay < 901) {
                netPay = grossPay * SECOND_TAX;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + SECOND_TAX + "%");
            } else if (grossPay > 901){
                netPay = grossPay * THIRD_TAX;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + THIRD_TAX + "%");
            } else {
                netPay = grossPay;
                System.out.println("Your gross pay is: " + grossPay + "€");
                System.out.println("Your net pay is: " + netPay + "€");
                System.out.println("Your tax is: " + FIRST_TAX + "%");
            }
        }
    }
}
