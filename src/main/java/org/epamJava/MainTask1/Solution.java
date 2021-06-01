package org.epamJava.MainTask1;

import java.util.Scanner;


/**
 * Задача 1 - Main
 *    Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        outHello();

    }

    public static void outHello() throws InterruptedException {
        Scanner scannerForName=new Scanner(System.in);
        System.out.println("Введите Ваше имя:");

        String name = scannerForName.nextLine();

        if(!name.isEmpty()){
            String str="Добро пожаловать ";
            System.out.print(str);

            /**
             * Просто делаем красиво
             */
            for (int i=0;i<3;i++){
                System.out.print('.');
                Thread.sleep(500);
            }

            System.out.print(" " + name);
        }
        else {
            System.out.println("Имя не введено");
        }

    }
}