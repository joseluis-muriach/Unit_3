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
                    if (seconds < 10) {
                        if (minutes < 10) {
                            if (hours < 10) {
                                System.out.println("0" + hours + ":0" + minutes + ":0" + seconds);
                            } else {
                                System.out.println(hours + ":0" + minutes + ":0" + seconds);
                            }
                        } else {
                            System.out.println(hours + ":" + minutes + ":0" + seconds);
                        }
                    } else if (minutes < 10){
                        if (hours < 10) {
                            System.out.println("0" + hours + ":0" + minutes + ":" + seconds);
                        } else {
                            System.out.println(hours + ":0" + minutes + ":" + seconds);
                        }
                    } else if (hours < 10){
                        System.out.println("0" + hours + ":" + minutes + ":" + seconds);
                    } else {
                        System.out.println(hours + ":" + minutes + ":" + seconds);
                    }
                }
            } else if (hours < 23){
                if (hours < 10) {
                    if (seconds < 10) {
                        System.out.println("0" + hours + ":" + minutes + ":0" + seconds);
                    } else {
                        System.out.println("0" + hours + ":" + minutes + ":" + seconds);
                    }
                } else {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            } else {
                System.out.println(hours + ":" + minutes + ":" + seconds);
            }
        } else if (minutes < 59){
            minutes++;
            if (minutes < 10) {
                if (hours < 10) {
                    System.out.println("0" + hours + ":0" + minutes + ":00");
                }
            } else if (hours < 10) {
                System.out.println("0" + hours + ":" + minutes + ":00");
            } else {
                System.out.println(hours + ":" + minutes + ":00");
            }
        } else if (hours < 23){
            hours++;
            if (hours < 10) {
                System.out.println("0" + hours + ":00:00");
            } else {
                System.out.println(hours + ":00:00");
            }
        } else {
            System.out.println("00:00:00");
        }

    }
}
