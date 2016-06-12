package jp.toastkid.java8handson;

/**
 * 年齢が 50 より小さい Person オブジェクトの名前(LastName+ FirstName) を表示.
 * @author Toast kid
 *
 */
public class HandsOn5 {
    public static void main(final String[] args) {
        Person.PEOPLE.stream()
            .filter(person -> person.getAge() < 50)
            .map(   person -> person.getLastName() + person.getFirstName())
            .forEach(System.out::println);
    }
}
