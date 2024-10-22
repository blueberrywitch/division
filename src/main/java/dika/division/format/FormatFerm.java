package dika.division.format;

import dika.division.enums.FormatType;

public class FormatFerm {

    public void printFormat(FormatType type, int[] result, int[] remaindor, int dividend, int divisor) {
        Format format = switch (type) {
            case CLASSICALFORMAT -> new ClassicalFormat();
            case GERMANFORMAT -> new GermanFormat();
        };

        format.printDivision(result, remaindor, dividend, divisor);
    }
}
