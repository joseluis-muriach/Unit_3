import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {

        int numbers = 0;
        int counter = 0;
        int numberCounter = 0;
        Scanner value = new Scanner(System.in);

        System.out.println("Introduce 10 numbers: ");

        while (numberCounter < 10){
            numbers = value.nextInt();
            if (numbers >= 0) {
                counter++;
            }
            numberCounter++;
        }
        System.out.println("There are " + counter + " positive numbers");
        System.out.println();


        //Otra forma, pero con el DO, WHILE
        int num = 0;
        int countNumbersTotal = 0;
        int countPositives = 0;


        System.out.println("Introduce 10 numbers: ");

        do {
            num = value.nextInt();

            if (num >= 0) {
                countPositives++;
            }
            countNumbersTotal++;

        } while(countNumbersTotal != 10);
        System.out.println("There are " + countPositives + " positive numbers");
    }
}
