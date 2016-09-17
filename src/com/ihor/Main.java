package com.ihor;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Введите число ");
        int k = l.nextInt();
        int x =k;
        int s = 0;
        while (x != 0 ){
            s +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }

}
