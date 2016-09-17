package com.ihor;


import java.util.Random;


public class Task6 {
    public static void main(String[] args) {

        int [][] arr = new int[7][4];
        int [] arr1 = new int[arr.length];
        for(int i =0;i<arr.length;i++){

            System.out.print("Номер строки - "+i+" ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*11)-5;
                System.out.print(arr[i][j]+" ");

                if(j==0)arr1[i]=arr[i][j];
                else arr1[i]*=arr[i][j];

                if(j==arr[i].length-1)
                    System.out.println(" ");
            }
        }

        int max=0;
        int max_i=0;

        for(int i=0;i<arr1.length;i++){
            if(Math.abs(arr1[i])>max){
                max=arr1[i];
                max_i=i;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов (" +max+ ") имеет индекс - " +max_i);
    }
}
