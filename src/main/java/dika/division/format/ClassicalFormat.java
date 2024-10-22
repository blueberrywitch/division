package dika.division.format;

import static java.lang.Math.abs;
import static java.lang.String.valueOf;

public class ClassicalFormat extends Format {

    @Override
    public void printDivision(int[] result, int[] remainder, int dividend, int divisor) {
        System.out.println(" " + dividend + " | " + divisor);
        int i = 1;
        int quotient = abs(dividend / divisor);
        while (i <= result.length) {

            if (remainder[i - 1] != 0) {

                if ((i != 1)) {
                    System.out.println(" ".repeat(i) + remainder[i - 1]);

                    if (i != result.length) {
                        System.out.println(" ".repeat(i - 1) + "‾" + result[i - 1]);
                        System.out.println(" ".repeat(i) + "--");
                    }
                } else {
                    System.out.println("‾" + result[i - 1] + " ".repeat(result.length - valueOf(result[i - 1]).length()) + "|" + "-".repeat(valueOf(quotient).length()));
                    System.out.println(" ".repeat(i) + "--" + " ".repeat(valueOf(quotient).length() - i) + "|" + dividend / divisor);
                }
            } else {
                System.out.print(remainder[i - 1]);
            }
            i++;
        }
    }
}
