package com.operatory;

public class Main4 {
    public static void main(String[] args) {
        int counter = 145;
        System.out.println(counter++);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);
        System.out.println("***");
        //nie wiem czy o taki wynik chodzilo: (dwa razy 146 w wyniku)
        System.out.println(counter++);
        System.out.println(counter);
        System.out.println(--counter);
        // czy o to.
    }
}
