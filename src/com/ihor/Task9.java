package com.ihor;

import java.util.Scanner;

/**
 * Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с

 клавиатуры). Результат должен быть: 2,3,5,7 ...
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Введите число:  ");
        int n = sr.nextInt();

        int currentNumber, dividers;
        for (currentNumber = 1; currentNumber < n; currentNumber++)
        {
            dividers = 0;
            for (int i = 1; i <= currentNumber; i++)
            {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <= 2)
                System.out.println(currentNumber);
        }

        }

    }

