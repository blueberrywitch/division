package dika.division.Format;

public class GermanFormat extends Format {

    @Override
    public void printDivision(int[] result, int[] remaindor, int dividend, int divisor) {
        System.out.print(" " + dividend + " : " + divisor + " = " + dividend / divisor + "\n");
        int i = 1;
        while (i <= result.length) {
            if (i != 1) {
                System.out.println(" ".repeat(i) + remaindor[i - 1]);
            }
            if (i != result.length) {
                System.out.println(" ".repeat(i) + result[i - 1]);
                System.out.println(" ".repeat(i) + "--");
            }
            i++;
        }
    }
}
