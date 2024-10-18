package dika.division.Format;

import GermanFormat;
import dika.division.enums.FormatType;

public class FormatFerm {

    public void printFormat(FormatType type, int[] result, int[] remaindor, int dividend, int divisor) {
        Format format = null;

        switch (type) {
            case CLASSICALFORMAT:
                format = new ClassicalFormat();
                break;
            case GERMANFORMAT:
                format = new GermanFormat();
                break;
        }
        format.printDivision(result, remaindor, dividend, divisor);
    }
}
