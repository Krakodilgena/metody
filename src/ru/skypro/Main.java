package ru.skypro;

import java.time.LocalDate;
import java.time.Year;

import static java.time.Year.isLeap;

public class Main {

    public static void main(String[] args)


    public static void checkLeapYear(int year) {
	//Задание 1
        boolean leapYear = Year.isLeap (year);
        if (leapYear) {
            System.out.println(year + " - високосный год ");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void printVersionSuggestion(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите неполную версию для IOS");
            } else {
                System.out.println("Установите обычную версию для IOS");
            }
        } else {
            if (deviceYear < currentYear) {
                System.out.println("Установите неполную версию для андройд");
            } else {
                System.out.println("Установите обычную версию для андройд");
            }
        }
    }

    public static int calculateDeliveryDays (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

    public static void validateString (String sort) {
        char[] letters = sort.toCharArray();
        char preyChar = Character.MAX_VALUE
        for (char c : letters)
            if (c == preyChar) {
                System.out.println("Дубликат найден: " + c);
                return;
            }
        preyChar = c;
        System.out.println("Дубликатов не найдено");
    }

    public static void revertArray(int [] arr) {
        if (arr.length <= 1) {
            return;
        }
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
        }
    }
}
