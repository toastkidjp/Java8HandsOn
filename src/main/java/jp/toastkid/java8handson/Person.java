package jp.toastkid.java8handson;

import java.util.Arrays;
import java.util.List;

/**
 * HandsOn5 & 6 で使用.
 * @author Toast kid
 *
 */
public class Person {

    private enum Gender {MALE, FEMALE};

    private final String firstName;
    private final String lastName;
    private final int    age;
    private final Gender gender;

    public static class Builder {
        private String firstName;
        private String lastName;
        private int    age;
        private Gender gender;

        public Builder setFirstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(final int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(final Gender gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(final Builder b) {
        this.firstName = b.firstName;
        this.lastName  = b.lastName;
        this.age       = b.age;
        this.gender    = b.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public static List<Person> PEOPLE = Arrays.asList(
        new Person.Builder().setFirstName("太郎").setLastName("山田").setAge(21)
            .setGender(Gender.MALE).build(),
        new Person.Builder().setFirstName("花子").setLastName("佐藤").setAge(25)
            .setGender(Gender.FEMALE).build(),
        new Person.Builder().setFirstName("次郎").setLastName("青山").setAge(45)
            .setGender(Gender.MALE).build(),
        new Person.Builder().setFirstName("アン").setLastName("港").setAge(85)
            .setGender(Gender.FEMALE).build(),
        new Person.Builder().setFirstName("三郎").setLastName("鈴木").setAge(25)
            .setGender(Gender.MALE).build(),
        new Person.Builder().setFirstName("四郎").setLastName("伊藤").setAge(67)
            .setGender(Gender.MALE).build(),
        new Person.Builder().setFirstName("五郎").setLastName("工藤").setAge(55)
            .setGender(Gender.MALE).build()
        );
}
