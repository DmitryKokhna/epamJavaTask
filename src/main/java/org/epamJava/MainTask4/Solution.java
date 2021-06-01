package org.epamJava.MainTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Задача 4 - Main
 *      Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        int sum=0;
        int mul=1;
int size;
        LinkedList<Integer> listOfDig=new LinkedList<>();


        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));


        System.out.println("\tВведите числа.\n\tДля окончания ввода нажмите на \"Enter\" дважды \n\\/ ");


        while (true){
            String inputDidAsStr= reader.readLine();
        if (!inputDidAsStr.isEmpty())   {
            Integer inputDidAsInteger=Integer.parseInt(inputDidAsStr);
            listOfDig.add(inputDidAsInteger);
        }
        else {
break;
        }

        }
        Integer[] listAsArray=listOfDig.toArray(new Integer[listOfDig.size()]);
        for (int j=0;j< listAsArray.length;j++){
       sum=sum+listAsArray[j];
       mul=mul*listAsArray[j];
     }

        System.out.println("\t\tИдет подсчет\n");
        Thread.sleep(1000);
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Произведение элементов: " + mul);

    }
}
