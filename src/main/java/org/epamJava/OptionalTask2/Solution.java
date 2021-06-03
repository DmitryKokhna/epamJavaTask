package org.epamJava.OptionalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Optional Task 2
 * В заднии достаточно выполнить 1-2 пункта.
 *  Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 * 1. СДЕЛАНО -  Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 * 2.  Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 * 3.  Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 * 4.  Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность матрицы N*N");

        int matrixSize = Integer.parseInt(reader.readLine());
        Thread.sleep(500);

        System.out.println("Размерность матрицы задана как = [" + matrixSize + "]" + "[" + matrixSize + "]");
        Thread.sleep(500);

        System.out.println("Укажите диапазон чисел для матрицы - Минимум и Максимум");
        Thread.sleep(500);

        System.out.println("Минальная граница диапазона");
        int minBorder = Integer.parseInt(reader.readLine());
        Thread.sleep(500);

        System.out.println("Максимальная граница диапазона");
        int maxBorder = Integer.parseInt(reader.readLine());
        Thread.sleep(500);

        System.out.println("Диапазон задан  от " + "\"" + minBorder + "\"" + " до " + "\"" + maxBorder + "\"\n");

        int[][] matrix = new int[matrixSize][matrixSize];
        int[][] matrixClone = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (maxBorder - minBorder) - minBorder);
                matrixClone[i][j] = matrix[i][j];
            }
        }
        System.out.print("Обрабатываем ");
        Thread.sleep(400);
        for (int z = 0; z < 3; z++) {
            System.out.print(" . ");
            Thread.sleep(400);
        }
        System.out.println("\n");

        System.out.println("\tСформированная матрица");
        for (int[] a : matrix
        ) {
            for (int s : a
            ) {
                System.out.print("\t" + s + " ");
            }
            System.out.println();
        }

        //1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

        /**
         * тут сортируем значения  в каждой строке
         */
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;

                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }

        System.out.println("\tОтсортированы в строках матрицы");
        for (int[] a : matrix
        ) {
            for (int s : a
            ) {
                System.out.print("\t" + s + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        System.out.println("\tИсходная (сформированная) таблица для наглядности");
        for (int[] a : matrixClone
        ) {
            for (int s : a
            ) {
                System.out.print("\t" + s + " ");
            }
            System.out.println();
        }

/**
 * тут сортируем в столбцах
 */
        boolean isSortedClone = false;
        int bufClone;
        while (!isSortedClone) {
            isSortedClone = true;
            for (int i = 0; i < matrixSize - 1; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    if (matrixClone[i][j] > matrixClone[i + 1][j]) {
                        isSortedClone = false;

                        bufClone = matrixClone[i][j];
                        matrixClone[i][j] = matrixClone[i + 1][j];
                        matrixClone[i + 1][j] = bufClone;
                    }
                }
            }
        }

        System.out.println("\tСортированы в столбцах матрицы");
        for (int[] a : matrixClone
        ) {
            for (int s : a
            ) {
                System.out.print("\t" + s + " ");
            }
            System.out.println();
        }
    }
}






