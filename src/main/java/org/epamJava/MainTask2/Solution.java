package org.epamJava.MainTask2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Задача 2 - Main
 *    Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(" Введите аргументы (числа)\n Для завершения ввода - введите букву s");

        LinkedList<Integer> dig = new LinkedList<>();
        Integer integer = null;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while (true) {
                s = bufferedReader.readLine();
                if (s.equals("s")) {
                    System.out.println("\nВвод завершен\n");
                    break;
                }
                integer = Integer.parseInt(s);
                dig.add(integer);

            }

            Collections.sort(dig);
            for (Integer out : dig
            ) {
                System.out.println(out);
            }
        }
        catch (IllegalArgumentException exception){
       //     System.out.println(exception.getMessage());
            System.out.println("\nВвено не число");
            System.out.println("Вы ввели "+"\""+s+"\"");
        }
    }



    }

