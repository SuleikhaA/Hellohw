package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String n = input.nextLine();


        System.out.println("Hello, " + n + ".");
    }
}
