package org.example._02_12_2024;

public class Operator {
    public static void main(String[] args) {
        int a = 2;

        if (a == 2){
            System.out.println("A");
        } else if ( a != 5) {
            System.out.println("B");
        } else{
            System.out.println("C");
        }


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("C " + i );
            }else {
                System.out.println("D " + i);
            }
        }

        int x = 5;
        System.out.println(x++ + ++x); //12

        String jn = "5";
        int c = 5;
        System.out.println(jn + c + c);//555
        System.out.println(jn + (c + c));//510
        System.out.println((jn + c) + c);//

        int j = 0;
        while (j<10){
            System.out.println("ef");
            j++;
        }
        for (int i = 0; i < 10 ; i+=2) {

        }

        for (int i = 10; i > 0 ; i--) {

        }

        char cb = 'q';
        cb++;
        for (char k = '0'; k < '~'; k++) {
            System.out.println(k);
        }
    }
}
