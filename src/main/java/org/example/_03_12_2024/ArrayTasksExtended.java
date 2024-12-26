package org.example._03_12_2024;


public class ArrayTasksExtended {
    public static void main(String[] args) {
        task16();
        task17();
        task20();
        task22();
        task23();
        task24();
        task26();
    }

    // 16. Найти все пары элементов, сумма которых равны заданному числу
    public static void task16() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + target);
                }
            }
        }


    }

    // 17. Проверить есть ли в массиве дубликаты
    public static void task17() {
        int[] array = {1, 2, 3, 4, 2};

        boolean hasDuplicates = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Дубликат: " + array[i] + " с индексами " + i + " и " + j);
                    hasDuplicates = true;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("Дубликатов не найдено!");
        }
        //System.out.println("hasDuplicates = " + hasDuplicates);

    }



    // 20. Найти количество чисел, делящихся на заданное число без остатка
    public static void task20() {
        int[] array = {10, 15, 20, 25, 30};
        int divisor = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                count++;
            }

        }
        System.out.println("count = " + count);
    }



    // 22. Найти индекс первого отрицательного элемента
    public static void task22() {
        int[] array = {1, 2, -3, 4, 5};
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }

    // 23. Подсчитать сумму чисел на четных индексах
    public static void task23() {
        int[] array = {1, 2, 3, 4, 5};
        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                summ += array[i];
            }
        }

        System.out.println("summ = " + summ);
    }

    // 24. Найти произведение всех элементов массива
    public static void task24() {
        int[] array = {1, 2, 3, 4};
        int mult = 1;
        for (int i = 0; i < array.length ; i++) {
            mult *= array[i];
        }
        System.out.println("mult = " + mult);
    }



    // 26. Найти количество уникальных элементов в массиве
    public static void task26() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;
        //int countUnic = array.length - count;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]) {

                }
            }

        }
        System.out.println("count = " + count);
        //System.out.println("countUnic = " + countUnic);

    }
    // 18. Удалить все нули из массива и сдвинуть элементы влево
    public static void task18() {
        int[] array = {0, 1, 0, 3, 0};

    }

    // 21. Упорядочить массив по возрастанию
    public static void task21() {
        int[] array = {4, 2, 7, 1, 3};

    }
    // 25. Переместить все отрицательные числа в конец массива
    public static void task25() {
        int[] array = {1, -2, 3, -4, 5};


    }

    // 27. Переставить минимальный элемент массива в начало
    public static void task27() {
        int[] array = {3, 2, 1, 4, 5};

    }

    // 28. Найти длину самой длинной последовательности одинаковых элементов
    public static void task28() {
        int[] array = {1, 1, 2, 2, 2, 3, 3};

    }

    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного
    public static void task29() {
        int[] array = {1, -2, 3, 4, -5};

    }

    // 30. Удалить все дубликаты из массива
    public static void task30() {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

    }


}
