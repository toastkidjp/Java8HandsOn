package jp.toastkid.java8handson;

/**
 * Runnable オブジェクトをラムダ式を使ってインスタンス化する.
 * Runnable を直接 run してますがハンズオンなので気にしないでください.
 * @author Toast kid
 *
 */
public class HandsOn1 {
    public static void main(final String[] args) {
        final Runnable r = () -> System.out.println("Hello Lambda !!");
        r.run();
    }
}
