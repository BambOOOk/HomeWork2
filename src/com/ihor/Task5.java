package com.ihor;


import java.util.Random;


public class Task5 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10 + random.nextInt(89);

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
