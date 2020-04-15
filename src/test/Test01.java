package test;

import domain.Person;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        System.out.println(person==person1);
    }
}
