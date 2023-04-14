package com.bridgelabz.junit;

import java.util.Scanner;

public class MonthlyPaymentUtil {
    public static double getMonthlyPayment(double principalAmount, double interestRate, int noOfYears) {
        double monthlyPayment = (principalAmount * interestRate) / (1 - Math.pow(1 + interestRate, -noOfYears));
        return monthlyPayment;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give Principal Amount");
        double principal = s.nextInt();

        System.out.println("Give Interest Rate in %");
        double interestInPercentage = s.nextInt();
        double  interest = interestInPercentage/100;

        System.out.println("Give Number of Years");
        int Years = s.nextInt();
        int years = Years * 12;

        System.out.println("Monthly Payment is: " +MonthlyPaymentUtil.getMonthlyPayment(principal,interest,years));


    }


}
