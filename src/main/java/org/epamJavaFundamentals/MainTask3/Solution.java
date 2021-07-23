package org.epamJavaFundamentals.MainTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;
import java.util.Random;

/**
 * Задача 3 - Main
 *    Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        int sizeArrFirst = 0;
        int sizeArrSecond=0;
        System.out.println("\nВведите размерность Двух массивов");
        Thread.sleep(800);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\nВведите размерность массива 1");
            System.out.print("-> ");
                        sizeArrFirst=Integer.parseInt(reader.readLine());
            Thread.sleep(200);
            System.out.println("размерность масива №1 задана равной: "+sizeArrFirst);

            Thread.sleep(800);
            System.out.println("\nВведите размерность массива 2");
            System.out.print("-> ");
            sizeArrSecond=Integer.parseInt(reader.readLine());
            Thread.sleep(200);
            System.out.println("размерность масива №2 задана равной: "+sizeArrSecond);
        }
        catch (IOException | IllegalFormatException exception) {
            System.out.println("Некорректный ввод");
        }

        int[] arrFirst=new int[sizeArrFirst];
        int[] arrSecond=new int[sizeArrSecond];

        System.out.print("Идет заполнение массивов ");
        for (int i=0;i<3;i++){
            Thread.sleep(500);
            System.out.print("."+" ");
        }

for (int i=0;i<sizeArrFirst;i++){
    arrFirst[i]=(int) (Math.random()*10);
   }
        for (int j=0;j<sizeArrSecond;j++){
                  arrSecond[j]=(int) (Math.random()*100);
        }

        System.out.println("\nМассивы заполнены");
        Thread.sleep(200);
        System.out.println("\nВыводим массив №1");
        for (int first: arrFirst
             ) {
            Thread.sleep(200);
            System.out.println(first);
        }
        Thread.sleep(200);
        System.out.println("\nВыводим массив №2");
        for (int second:arrSecond
        ) {
            Thread.sleep(200);
            System.out.print(second+" ");
                   }
        System.out.println("\n\n");
    }

}
