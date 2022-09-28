import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        Scanner value = new Scanner(System.in);

        System.out.print("Introduce the hours: ");
        hours = value.nextInt();

        System.out.print("Introduce the minutes: ");
        minutes = value.nextInt();

        System.out.print("Introduce the seconds: ");
        seconds = value.nextInt();

        if (seconds < 59) {
            seconds++;
            if(minutes < 59){
                if (hours < 24) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            } else if (seconds == 59){
                System.out.println(hours + ":" + (minutes + 1) + ":00");
            } else {
                System.out.println(hours + ":" + minutes + ":" + seconds);
            }
        } else if (minutes < 59){
            System.out.println(hours + ":" + (minutes + 1) + ":00");
        } else if (hours < 23){
            System.out.println((hours + 1) + ":00:00");
        } else {
            System.out.println("00:00:00");
        }
    }
}
