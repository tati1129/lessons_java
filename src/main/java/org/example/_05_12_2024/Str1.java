package org.example._05_12_2024;

public class Str1 {



    public static void main(String[] args) {
        int n = 10;
        String str = "nvxs";
        String str1 = String.valueOf(n);

        System.out.println("String.valueOf(n) = " +  str1);// 10

        String s1 = "WWW";
        String s2 = "WWW";
        String s3 = new String("WWW");

        System.out.println(s1 == s2); //true потому что ссылается на одну переменную
        System.out.println(s1 == s3); // false потому что при создании через new создается новый объект

        System.out.println(s1.equals(s3)); // true потому что сравнивается внешний вид
    }
}
