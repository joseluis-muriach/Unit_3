import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        float retailPrice = 0;
        float realPrice   = 0;
        float discount    = 0;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter the retail price:");
        retailPrice = inputValue.nextFloat();

        System.out.println("Enter the real price:");
        realPrice = inputValue.nextFloat();
        discount = (retailPrice - realPrice) / retailPrice * 100;
        System.out.println("The discount is: " + discount + "%");
    }
}
