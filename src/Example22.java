public class Example22 {
    public static void main(String[] args) {

        int numbers = 1;
        int sum = 0;
        long multiplication = 1;

        while (numbers <= 10) {
            sum += numbers;
            multiplication *= numbers;
            numbers++;
        }
        System.out.println("The sum of the 10 natural numbers is: " + sum);
        System.out.println("The multiplication of the 10 natural numbers is: " + multiplication);
        System.out.println();

        //Vamos ha hacerlo con el FOR
        sum = 0;
        multiplication = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            multiplication *= i;
        }
        System.out.println("The sum of the 10 natural numbers is: " + sum);
        System.out.println("The multiplication of the 10 natural numbers is: " + multiplication);
    }
}
