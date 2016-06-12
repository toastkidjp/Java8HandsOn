package jp.toastkid.java8handson;

import java.util.stream.Collectors;

/**
 * Person を年齢で昇順ソートし、名前(LastName + FirstName) をカンマ区切りで連結した文字列を取得.
 * @author Toast kid
 *
 */
public class HandsOn6 {
    public static void main(final String[] args) {
        System.out.println(
            Person.PEOPLE.stream()
                .sorted((p1, p2) ->Integer.compare(p1.getAge(), p2.getAge()))
                .map(    person -> person.getLastName() + person.getFirstName())
                .collect(Collectors.joining(", "))
                );
    }
}
