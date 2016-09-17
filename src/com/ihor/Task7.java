package com.ihor;

import java.util.Scanner;

/**
 * Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму

 чисел от 1 до n;
 */
public class Task7 {

    public static void main(String[] args) {

    int rand ;
        int beg1=1;
        int beg2=2;
        int beg3;
    Scanner sr = new Scanner(System.in);
        System.out.println("Введите число ");

        rand = sr.nextInt();

        for (int i = beg1;i<rand;i++){

            beg1=beg1+i;





        }
        System.out.println(beg1);
    }
}
