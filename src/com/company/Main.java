package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        animals();
    }


    public static int animals() {
        System.out.println("how many chickens?");
        int chick = input.nextInt() * 2;
        System.out.println("how many cows?");
        int cows = input.nextInt() * 4;
        System.out.println("how many pigs?");
        int pigs = input.nextInt() * 4;
        int legs = chick + cows + pigs;
        System.out.println(legs);
        return legs;
    }
}




