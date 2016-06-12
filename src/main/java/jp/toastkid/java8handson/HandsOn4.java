package jp.toastkid.java8handson;

import java.util.stream.IntStream;

/**
 * Stream API で FizzBuzz する.
 * @author Toast kid
 *
 */
public class HandsOn4 {

    public static void main(final String[] args) {
        fizzBuzz(100);
    }

    /**
     * 整数 n までの FizzBuzz を出力する.
     * @param n
     */
    private static void fizzBuzz(final int n) {
        IntStream.range(1, n + 1).forEach(i -> {
            if (1 < i) {
                System.out.print(", ");
            }
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
                return;
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
                return;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                return;
            }
            System.out.print(i);
        });
    }
}
