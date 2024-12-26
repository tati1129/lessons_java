package org.example._02_12_2024;

public class Test1 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i >= 0 && i <= 20) {
                System.out.println("number " + i + " 0 - 20");
            } else if (i > 20 && i <= 40) {
                System.out.println("number " + i + " 21 - 40");
            } else {
                System.out.println("number " + i + " > 40");
            }
        }


        int x = 5;
        int f = 1;

        for (int i = 1; i <= x; i++) {
            f *= i;

        }
        System.out.println("f = " + f);
    }
}
