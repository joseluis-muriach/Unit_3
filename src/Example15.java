import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        float mark = 0f;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce the mark: ");
        mark = value.nextFloat();

        if (mark > 0 && mark < 3) {
            System.out.println("Muy deficiente");
        } else if (mark < 5) {
            System.out.println("Insuficiente");
        } else if (mark < 6) {
            System.out.println("Suficiente");
        } else if (mark < 7) {
            System.out.println("Bien");
        } else if (mark < 9) {
            System.out.println("Notable");
        } else if (mark <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}
