package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the change amount:");
        int changeToReturn=s.nextInt();

        int[] availableNotes=   {1000, 500, 100, 50, 10, 5, 2, 1};
        int[] noOfNoteToReturn= {   0,   0,   0,  0,  0, 0, 0, 0};

        // Calculate no of notes
        for (int i = 0; i < availableNotes.length; i++) {
            while(changeToReturn - availableNotes[i] >= 0)
            {
                changeToReturn = changeToReturn - availableNotes[i];
                noOfNoteToReturn[i]++;
            }
        }

        // print the output
        for (int i = 0; i < availableNotes.length; i++) {
            System.out.println(noOfNoteToReturn[i]+" notes of " + availableNotes[i]);
        }
    }
}
