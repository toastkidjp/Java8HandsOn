package jp.toastkid.java8handson;

/**
 * MyFunction (関数型インタフェース)を引数にとる print メソッドを実装する.
 * @author Toast kid
 *
 */
public class HandsOn2 {

    public static void main(final String[] args) {
        print(10, 2, (a, b) -> 10 + 2);
    }

    private static void print(final int a, final int b, final MyFunction f) {
        System.out.println(f.calc(a, b));
    }

    private interface MyFunction {
        int calc(int a, int b);
    }
}
