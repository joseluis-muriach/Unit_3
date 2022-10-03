import java.text.DecimalFormat;
import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {

        float grades = 0;
        float sum = 0;
        float averageGrade = 0f;
        int count = 0;
        int countTen = 0;
        Scanner value = new Scanner(System.in);

        System.out.println("Introduce the grades: ");

        do {
            grades = value.nextFloat();
            if (grades >= 0) {
                sum += grades;
                count++;
                if (grades == 10) {
                    countTen++;
                }
            }
        } while (grades >= 0);
        averageGrade = sum / count;
        //Creo esta variable (result) para que el float unicamente ponga dos decimales
        //Extraido de: https://es.stackoverflow.com/questions/144301/mostrar-n%c3%bamero-con-dos-decimales
        String result = String.format("%.2f", averageGrade);
        //Otra manera de hacerlo
        DecimalFormat resultB = new DecimalFormat("#.000");

        System.out.println("-> Your average grade is: " + result);
        System.out.println("-> You have " + countTen + " grades excelents ('10')");
        System.out.println();
        System.out.println("-> Your average grade is: " + resultB.format(averageGrade));
    }
}
