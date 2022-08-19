package com.uncornWimps;


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number u want to reverse :");
        int numReverse = input.nextInt();
        int reverse = 0;
        for( ;numReverse != 0; numReverse/=10) {
            int remainder = numReverse % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse number is :  " + reverse);
    }
}