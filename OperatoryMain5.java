package com.operatory;

public class Main5 {
    public static void main(String[] args) {
    int a = 1;
    int b;
		System.out.println(++a); //2
		System.out.println(a++); //2
		System.out.println(a); //3
    b=a++; //3
		System.out.println(b); //3
    b=++a; //3
		System.out.println(++a); //? tego wiersza nie rozumiem
    }
}
