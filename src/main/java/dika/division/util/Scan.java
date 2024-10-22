package dika.division.util;

import java.util.Scanner;

public class Scan {

    public static int scanDataInt() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 0) {
            throw new IllegalArgumentException("Number can not be 0");
        }
        return number;
    }

    public static String scanDataString() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        if (string.isEmpty()) {
            throw new IllegalArgumentException("String can not be empty");
        }
        return string;
    }
}
