package org.epamJava.OptionalTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Optional Task 1
 * Для успешного выполнения задания достаточно реализовать 2-4 пункта.
 *
 * Задание. Ввести n чисел с консоли.
 * 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 * 2.     Вывести числа в порядке возрастания (убывания) значений их длины.
 * 3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 * 4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 * 5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 * 6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 * 7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 **/

public class Solution {
    public static void main(String[] args) throws IOException {
        //без проверки на корректность ввода

        int[] arrayOfDigits= new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\tВведите 5 чисел.\n");
int sizeArr=0;

for (int i=0;i<arrayOfDigits.length;i++){
    int inputDigInt = Integer.parseInt(reader.readLine());
    arrayOfDigits[i]=inputDigInt;
    sizeArr=sizeArr+1;
    if (sizeArr==5){
        System.out.println("Ввод завершен");
        break;
    }
}

        //2.     Вывести числа в порядке возрастания (убывания) значений их длины.

        System.out.println("\tЭто массив");
        for (int s: arrayOfDigits
             ) {
            System.out.println(s);
        }

  //    int lengthOfDigit=String.valueOf(arrayOfDigits[0]).length(); // через длину Строки определяем кол-во цифр в числе

       //сортировка
            int buf;

        boolean isSorted = false;
int minDig=arrayOfDigits[0];
int lengthOfMinDig=String.valueOf(arrayOfDigits[0]).length();
        int maxDig=arrayOfDigits[0];
        int lengthOfMaxDig=String.valueOf(arrayOfDigits[0]).length();

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayOfDigits.length-1; i++) {
                if(String.valueOf(Math.abs(arrayOfDigits[i])).length() > String.valueOf(Math.abs(arrayOfDigits[i+1])).length()){
                    isSorted = false;
                    buf = arrayOfDigits[i];
                    arrayOfDigits[i] = arrayOfDigits[i+1];
                    arrayOfDigits[i+1] = buf;

                }
            }
            for (int i = 0; i < arrayOfDigits.length; i++){
                if(String.valueOf(Math.abs(arrayOfDigits[i])).length() < lengthOfMinDig){
                    lengthOfMinDig=String.valueOf(Math.abs(arrayOfDigits[i])).length();
                    minDig=arrayOfDigits[i];
                }

            }
            for (int i = 0; i < arrayOfDigits.length; i++){
                if(String.valueOf(Math.abs(arrayOfDigits[i])).length() > lengthOfMaxDig){
                    lengthOfMaxDig=String.valueOf(Math.abs(arrayOfDigits[i])).length();
                   maxDig=arrayOfDigits[i];
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfDigits));
        System.out.println("Самое короткое число - " + minDig+ " и его размерность " + lengthOfMinDig);
        System.out.println("Самое длинное число - " + maxDig+ " и его размерность " + lengthOfMaxDig);

    }
}
