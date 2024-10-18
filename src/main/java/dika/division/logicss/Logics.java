package dika.division.logicss;

import lombok.AllArgsConstructor;


import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.String.valueOf;

@AllArgsConstructor
public class Logics {

    public int[] divide(int dividend, int divisor) {
        int[] result = new int[valueOf(abs(dividend / divisor)).length() + 1];

        for (int i = 0; i < result.length; i++) {
            int num = (int) (dividend % (divisor * pow(10, i)));
            if (dividend < 0) {
                dividend += abs(num);
            } else {
                dividend -= abs(num);
            }
            while (num % 10 == 0 && num != 0) {
                num = num / 10;
            }
            result[i] = num;
        }
        reverseArray(result);
        return result;
    }

    public int[] remaindor(int dividend, int divisor) {
        int[] result = new int[valueOf(dividend / divisor).length() + 1];
        String string = valueOf(abs(dividend));
        String str = "";
        int i = 0;
        int index = 0;
        while (i < string.length()) {
            str += string.charAt(i);
            if (Integer.parseInt(str) >= abs(divisor)) {
                result[index] = Integer.parseInt(str);
                index++;
                str = valueOf(abs(Integer.parseInt(str) % divisor));
            }
            i++;
        }
        result[result.length - 1] = dividend % divisor;
        return result;
    }

    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
