package org.example._05_12_2024.task1;

public class ArrayTasksWhithStringA {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // 1. Найти сумму элементов массива чисел
    public static void task1() {
        System.out.println("Task 5: ");
        int[] array = {1, 2, 3, 4};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println("summ = " + summ);
    }

    // 2. Найти длину самой длинной строки в массиве строк
    public static void task2() {
        System.out.println("Task 2: ");
        String[] array = {"cat", "elephant", "dog"};

        int length = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > length) {
                length = array[i].length();
                index = i;
            }
        }
        System.out.println("length = " + length);
        System.out.println("Index bigger string in array is:  " + index);
    }

    // 3. Проверить, содержит ли массив строк заданное слово
    public static void task3() {
        System.out.println("Task 3: ");
        String[] array = {"apple", "banana", "cherry"};
        String target = "banana";
        int index = -1;

        boolean isContainString = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                isContainString = true;
                index = i;
            }
//            if (!(index < 0 || index > array.length)){
//                System.out.println("index = " + index);
//            } else {
//                System.out.println("Array  isn't contain this word " + target);
//
//            }
        }
        System.out.println("isContainString = " + isContainString);

    }

    // 4. Подсчитать количество строк, содержащий данный символ
    public static void task4() {
        System.out.println("Task 4: ");
        String[] array = {"apple", "banana", "cherry"};
        char target = 'a';
        int count = 0;
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(Character.toString(target))) {
                count++;
            }
        }
        if (count <= 0 || count > array.length) {
            System.out.println("The strings don't contain the character: " + target);

        } else {
            System.out.println("The strings  contain a character: " + target);
            System.out.println("count = " + count);
        }


    }

    // 5. Найти строку с максимальным количеством символов 'e'
    public static void task5() {
        System.out.println("Task 5: ");

        String[] array = {"elephant", "eagle", "dog"};
        char targetChar = 'e';
        String maxString = "";
        int maxCount = 0;


        for (int i = 0; i < array.length; i++) {
            int count = 0;
            String str = array[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == targetChar){
                    count ++;
                }
            }
            if (count>maxCount){
                maxCount = count;
                //System.out.println(array[i]);
            }
        }
        System.out.println("maxCount = " + maxCount);
        //System.out.println("maxString = " + maxString);i
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == targetChar) {
                    count++;
                }
            }
            if (count == maxCount){
                System.out.print(array[i] + " ");
            }
        }
    }

    // 6. Удалить из массива строк все строки, содержащие заданное слово
    public static void task6() {
        System.out.println();
        System.out.println("Task 6: ");

        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";

    }

}
