package com.bridgelabz.junit;

public class Binary {
    public static int swapNibbles(int n)
    {
        return ((n & 0x0F) <<4  | ( n & 0xF0) >>4);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.print(swapNibbles(n));
    }
}
