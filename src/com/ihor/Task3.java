package com.ihor;

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int count = 0;

         for (a=0;a<=9;a++){
             for(b=0;b<=9;b++){
                 for(c=0;c<=9;c++){
                     for (d=0;d<=9;d++){
                         for (e=0;e<=9;e++){
                             for (f=0;f<=9;f++){
                                 if (a+b+c==d+e+f){
                                     count=count+1;

                                 }
                             }
                         }
                     }
                 }
             }
         }
        System.out.println("Совпадений: "+count);
    }
}
