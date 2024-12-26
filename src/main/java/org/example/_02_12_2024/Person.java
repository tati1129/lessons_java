package org.example._02_12_2024;

public class Person {
    String name;
    String email;
    int age;

    public Person() {

    }

    public static void main(String[] args) {
        Person person = new Person();
        //Person - тип данных
        //person - ссылка, где лежит этот Person - тип данных
        //new - создается этот объект
        //Person() - сами эти данные, кот собираются по конструктору
    }
}
