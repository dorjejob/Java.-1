package lesson_3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HW_3 {

    public static Scanner len = new Scanner(System.in);
    public static Scanner initialValue = new Scanner(System.in);

    public static void main(String[] args) {

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание 1: ");
        int[] nuliIEdinitsi = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nuliIEdinitsi.length; i++) {
            System.out.print(nuliIEdinitsi[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < nuliIEdinitsi.length; i++)
            if (nuliIEdinitsi[i] == 1) {
                nuliIEdinitsi[i] = 0;
            } else nuliIEdinitsi[i] = 1;
        for (int i = 0; i < nuliIEdinitsi.length; i++) {

            System.out.print(nuliIEdinitsi[i] + " ");
        }
        System.out.println("");
        System.out.println("");
//        2. Задать пустой целочисленный массив длиной 100.
//        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Задание 2: ");
        int[][] myMass100 = new int[10][10];
        int count = 0;
        for (int y = 0; y < myMass100.length; y++) {
            for (int x = 0; x < myMass100[y].length; x++) {
                myMass100[y][x] = count;
                count++;
                System.out.print(count + "\t");
            }
            System.out.println("");


        }
        System.out.println("");
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3: ");
        int[] newMass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newMass.length; i++) {
            System.out.print(newMass[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < newMass.length; i++) {
            if (newMass[i] < 6) {
                System.out.print(newMass[i] * 2 + "\t");
            } else System.out.print(newMass[i] + "\t");
        }
        System.out.println("");
        System.out.println("");
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Задание 4: ");
        int[][] massDiagonal = new int[10][10];
        for (int y = 0; y < massDiagonal.length; y++) {
            for (int x = 0; x < massDiagonal[y].length; x++) {
                if (x == y)
                    massDiagonal[x][y] = 1;
                System.out.print(massDiagonal[x][y] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        System.out.println("Задание 5: ");
        System.out.print("Длинна массива: ");
        int y = len.nextInt();
        System.out.print("Значение ячейки: ");
        int x = initialValue.nextInt();
        int[] massiv = new int[y];
        System.out.println("");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = x;
            System.out.print(massiv[i] + "\t");
        }
        System.out.println("");

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        System.out.println("Задание 6: ");
        int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0];
        for (int i = 0; i != mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
            if (mas[i] > max){
                max = mas[i];
            }

        }
        System.out.println("min: " + min );
        System.out.println("max: " + max);
    }

}






