import java.util.Scanner;

public class Example23_1 {
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
        System.out.println("-> Your average grade is: " + result);
        System.out.println("-> You have " + countTen + " grades excelents ('10')");

        //Ahora lo hacemos solo con el WHILE y utilizaremos un boolean
        boolean negativeNumber = false;
        double number = 0;
        sum = 0;
        count = 0;

        while (negativeNumber) {
            number = value.nextDouble();
            if (number >= 0) {
                sum += number;
                count++;
            } else {
                negativeNumber = true;
            }
        }
        averageGrade = 0;
        averageGrade = sum / count;
        System.out.println("-> Your average grade is: " + result);
        System.out.println("-> You have " + countTen + " grades excelents ('10')");
    }
}

