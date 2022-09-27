import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        int age = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce your age: ");
        age = value.nextInt();

        if (age >= 18) {
            System.out.println("You have the legal age");
        } else {
            System.out.println("Sorry, you don't have the legal age");
        }
    }
}
