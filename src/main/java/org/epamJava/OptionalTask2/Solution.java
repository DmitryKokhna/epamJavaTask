package org.epamJava.OptionalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Optional Task 2
 В заднии достаточно выполнить 1-2 пункта.

 Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
 1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

 2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

 3.     Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

 4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность матрицы N*N");

        int matrixSize=Integer.parseInt(reader.readLine());
        System.out.println("Размерность матрицы задана как = ["+matrixSize+"]"+"["+matrixSize+"]");
Thread.sleep(400);
        System.out.println("Укажите диапазон чисел");
        System.out.println("Мимальная граница");
        int minBorder=Integer.parseInt(reader.readLine());
        System.out.println("Максимальная граница");
        int maxBorder=Integer.parseInt(reader.readLine());

        System.out.println("Диапазон задан как от "+minBorder+" до "+ maxBorder);
      int[][] matrix=new int[matrixSize][matrixSize];
    //    int[][] matrix= {{1,2,3},{4,5,6}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
            matrix[i][j]=(int)(Math.random()*(maxBorder-minBorder)-minBorder);
        }}
        for (int[] a: matrix
             ) {
            for (int s: a
                 ) {
                System.out.print(s+" ");
            }
            System.out.println();
        }

        }

    }

