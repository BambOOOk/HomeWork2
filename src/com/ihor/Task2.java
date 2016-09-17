package com.ihor;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int f1=1;
        int f2=1;
        int f3;
        System.out.println("Последовательность Фибоначи: "+f1);
        System.out.println("Последовательность Фибоначи: "+f2);
        for (int i=2;i<11;i++){

            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.println("Последовательность Фибоначи: "+f3);

        }
    }

}
