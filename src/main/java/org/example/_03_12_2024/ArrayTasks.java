package org.example._03_12_2024;

public class ArrayTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task14();
        task15();

    }


    // 1. Найти сумму элементов массива
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("sum = " + sum);
    }

    // 2. Найти минимальный элемент массива
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }

    // 3. Найти максимальный элемент массива
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    // 4. Найти индекс минимального элемента массива
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        int index = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }

        }
        System.out.println("index = " + index);
    }

    // 5. Найти индекс максимального элемента массива
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                index = i;
            }
        }
        System.out.println("index = " + index);
    }

    // 6. Посчитать количество положительных элементов
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    // 7. Посчитать количество отрицательных элементов
    public static void task7() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    // 8. Посчитать количество четных элементов
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    // 9. Посчитать количество нечетных элементов
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    // 10. Проверить есть ли в массиве заданное число
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        boolean isTarget = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                isTarget = true;
            }
        }
        System.out.println("isTarget = " + isTarget);
    }

    // 11. Найти среднее арифметическое значение элементов в массиве
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        int sumElem = 0;
        for (int i = 0; i < array.length; i++) {
            sumElem += array[i];
        }
        double arifm = (double) sumElem / array.length;
        System.out.println("arifm = " + arifm);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;

        System.out.println("avg = " + avg);
        for (int i = 0; i < array.length; i++) {
            if (avg < array[i]) {
                System.out.println("array[i] = " + array[i]);
            }

        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию
    public static void task13() {
        int[] array = {1, 2, 3, 4};
    }

    // 14. Найти второй по величине элемент массива
    public static void task14() {
        int[] array = {1, -2, 3, -4};
        int min1 = array[0];
        int min2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            }
            if (array[i] < min2 && array[i] > min1) {
                min2 = array[i];
            }
        }
        // System.out.println("max1 = " + max1);

        System.out.println("min1 = " + min1);
        System.out.println("min2 = " + min2);
    }

    // 15. Представить элементы массива в обратном порядке
    public static void task15() {
        int[] array = {1, 2, 3, 4};

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}
