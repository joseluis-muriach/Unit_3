import java.util.GregorianCalendar;
import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {

        int year = 0;
        Scanner value = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.print("Introduce the year: ");
        year = value.nextInt();

        //Podriamos hacerlo asi, la forma mas sencilla
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }

        //O de esta manera, yo la descubri por internet
        if (calendar.isLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
}
