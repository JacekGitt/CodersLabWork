package com.kontrola;

public class Main2 {
    public static void main(String[] args) {

        int nr1 = 5;
        int nr2 = 15;
        int nr3 = 20;
        int number;
        if (nr1 > nr2 && nr1 > nr3) {
            number = nr1;
        } else if (nr2 > nr1 && nr2 > nr3) {
            number = nr2;
        } else
             {
            number = nr3;
        }
        System.out.print("Najwieksza z liczb ");
        System.out.print(nr1);
        System.out.print(", ");
        System.out.print(nr2);
        System.out.print(", ");
        System.out.print(nr3 );
        System.out.print(" to ");
        System.out.print( + number);
        System.out.print(".");
    }
}
