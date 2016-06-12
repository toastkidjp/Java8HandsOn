package jp.toastkid.java8handson;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 整数値リストの101以上200未満の要素を合計する.
 * @author Toast kid
 *
 */
public class HandsOn7 {
    public static void main(final String[] args) {
        final List<Integer> games = Arrays.asList(118, 65, 152, 201, 126);
        final Optional<Integer> totalScore = games.stream()
                .filter(i -> 100 < i)
                .filter(i -> i < 200)
                .reduce((a, b) -> a += b);
        System.out.println(totalScore.get());
    }
}
