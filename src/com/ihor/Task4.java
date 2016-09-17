package com.ihor;

/**
 * Created by ihor on 08.09.16.
 */
public class Task4 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int count=0;

        for (a=0;a<=2;a++){
            for(b=0;b<=9;b++){
                for(c=0;c<=5;c++){
                    for (d=0;d<+9;d++){
                        if (a==d&&b==c) {
                            count=count+1;
                           //System.out.println("Совпадений: "+count);

                        }
                    }
                }
            }
           // System.out.println("Совпадений: "+count);
        }

        System.out.println("Совпадений в часах: "+count);
    }

}
