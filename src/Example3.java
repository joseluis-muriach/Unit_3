import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        float square = 0f;
        float x = 0f;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce the square: ");
        x = value.nextFloat();

        square = x * x;

        System.out.println("The square is: " + square);
    }
}
