package jp.toastkid.java8handson;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 関数型インタフェイスを使う.
 * @author Toast kid
 *
 */
public class HandsOn3 {

    public static void main(final String[] args) {
        first();
        second();
        third();
    }

    /**
     * 引数なし.
     * get() で任意の文字列を返す s を Supplier で実装
     */
    private static void first() {
        final Supplier<String> s = () -> "tomato";
        System.out.println(s.get());
    }

    /**
     * 引数1つ.
     * 引数を Sysout するメソッド accept を持つ c を Consumer で実装
     */
    private static void second() {
        final Consumer<Integer> c = System.out::println;
        c.accept(25);
    }

    /**
     * 引数2つ.
     * 2つの引数の和を返すメソッド apply を持つ bf を BiFunction で実装
     */
    private static void third() {
        final BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
        System.out.println(bf.apply(1, 2));
    }

}
