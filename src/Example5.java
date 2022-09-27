import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        float radius = 0f;
        float pi = 3.1416f;
        float area = 0f;
        float length = 0f;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce the radius: ");
        radius = value.nextFloat();

        area = pi * (radius * radius);
        length = (2 * radius) * pi;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The length of the circle is: " + length);
    }
}
