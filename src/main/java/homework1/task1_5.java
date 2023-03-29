package homework1;

import javax.swing.*;
import java.util.Arrays;

public class task1_5 {

    public static void main(String[] args) {
        System.out.println("Задача 1: ");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println("Задача 2: ");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        System.out.println("Задача 3: ");
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(" ");
        System.out.println("Задача 4: ");
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2020));  // true

        System.out.println("Задача 5: ");
        System.out.println(Arrays.toString(createArray(5, 8)));

        System.out.println("Доп 1: ");
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(arrayOne) + " -> ");
        System.out.println(Arrays.toString(createNewArray(arrayOne)));

        System.out.println("Доп 2: ");
        int[] arrayTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arrayTwo) + " -> ");
        System.out.println(Arrays.toString(createArrayTwo(arrayTwo)));

        System.out.println("Доп 3: ");
        int[][] arrayTree = new int[5][5]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        createArrayThree(arrayTree);
    }

    /**
     * Задача 1.
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Задача 2.
     * Проверить, что х положительное.
     */
    private static boolean isPositive(int x) {
        if (x > 0) return true;
        else return false;
    }

    /**
     * Задача 3.
     * Напечатать строку source repeat раз.
     */
    private static void printString(String source, int repeat) {
        if (repeat == 0) return;
        System.out.print(source);
        printString(source, repeat - 1);
    }

    /**
     * Задача 4.
     * проверить, является ли год високосным. если да - return true
     * год является високосным, если он делится на 4.
     * год, который делится без остатка на 100 (например, 1900) является високосным годом
     * только в том случае, если он также без остатка делится на 400.
     */
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) return true;
        if (year % 100 == 0 && year % 400 == 0) return true;
        else return false;
    }

    /**
     * Задача 5.
     * должен вернуть массив длины len, каждое значение которого равно initialVal
     */
    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static int[] createNewArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }

    /* 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    private static int[] createArrayTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        return arr;
    }
    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    private static void createArrayThree(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i || j + i == arr.length - 1) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}