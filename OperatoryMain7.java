package com.operatory;

public class Main7 {
    public static void main(String[] args) {
        int nr1 = 7;
        int nr2 = 4;
        int result = (nr1 + nr2);
        System.out.println(result);
        nr1 = 10;
        result = (nr1 + nr2);
        System.out.println(result);
        // stalo sie tak dlatego ze wynik jat najpierw 7+4=11, a potem 10+4=14
    }
}
