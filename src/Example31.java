import java.util.Scanner;

public class Example31 {
    public static void main(String[] args) {

        int num = 0;
        String slash = "/";
        String result = "";
        String totalSlash = "";
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce a number: ");
        num = value.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                result = result + i + " ";
            } else {
                result = i + " " + result + i + " ";
            }
            for (int j = num; j > i; j--) {
                totalSlash += slash + " ";
            }
            System.out.println(totalSlash + result + totalSlash);
            totalSlash = "";
        }
    }
}
