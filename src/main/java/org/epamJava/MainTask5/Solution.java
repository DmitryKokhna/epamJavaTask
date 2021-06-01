package org.epamJava.MainTask5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.IllegalFormatException;

/**
 * Задача 5 - Main
 * Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */
public class Solution {
    enum Month {

        January(1), February(2),
        March(3), April(4), May(5),
        June(6), July(7), August(8),
        September(9), October(10), November(11),
        December(12);

        private int title;

        Month(int title) {
            this.title = title;
        }

        public int getTitle() {
            return title;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\tВведите число, чтобы узнать месяц (от 1 до 12 включительно)");
// для реализацтт через Массив
        Enum[] arrayEnum = Month.values();
        try {
            int numberOfMonthInArray = Integer.parseInt(reader.readLine());
            System.out.println(arrayEnum[numberOfMonthInArray - 1]);

            //релизация через switch
            switch (numberOfMonthInArray) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май ");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("\tВведено число вне диапазона");
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("\tВведено число вне диапазона");
        } catch (IllegalFormatException illegalFormatException) {
            System.out.println("\tВведено не числовое значение");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("\tВведено не числовое значение");
        }

    }
}




