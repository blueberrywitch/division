package dika.division;

import dika.division.format.FormatFerm;
import dika.division.enums.FormatType;
import dika.division.logicss.Logics;
import dika.division.util.Scan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DivisionApplication {

    public static void main(String[] args) {
        Logics logics = new Logics();

        int dividend = Scan.scanDataInt();
        int divisor = Scan.scanDataInt();
        String format = Scan.scanDataString();

        int[] result = logics.divide(dividend, divisor);
        int[] remaindor = logics.remaindor(dividend, divisor);

        FormatFerm formatFerm = new FormatFerm();
        formatFerm.printFormat(FormatType.valueOf(format), result, remaindor, dividend, divisor);
    }

}
