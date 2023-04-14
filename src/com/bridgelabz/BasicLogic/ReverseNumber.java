package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num , rev = 0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Number: ");
        num=r.nextInt();
        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse Num: " + rev);

    }
}
