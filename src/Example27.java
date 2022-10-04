public class Example27 {
    public static void main(String[] args) {

        int numA = 0;
        int numB = 1;
        int numC = 0;

        System.out.print(numA + ", ");

        for (int i = 1; i <= 40; i++) {
            numC =  numA + numB;
            numA = numB;
            numB = numC;
            numC = 0;
            System.out.print(numA + ", ");

            //Hago esto para que cuando lleguemos a 10 resultados, haga un salto de linea y se vea mejor
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
