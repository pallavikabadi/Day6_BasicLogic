package com.bridgelabz.junit;

import java.util.Scanner;

public class TemperatureConversion {
    
    public static double getCelsiusToFahrenheit(double celsius)
    {
        double fahrenheit = ( celsius * (9.0/5.0) ) + 32.0;
        return fahrenheit;
    }

    public static double getFahrenheitToCelsius(double fahrenheit)
    {
        double celsius= ( fahrenheit -32.0 )*(5.0/9.0);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Select conversion");
        System.out.println("1.Celsius To Fahrenheit");
        System.out.println("2.Fahrenheit To Celsius");

        int option=s.nextInt();

        if(option==1)
        {
            System.out.println("Give Temperature in Celsius");
            double cel =  s.nextDouble();

            System.out.println("The Temperature in Fahrenheit is " + getCelsiusToFahrenheit(cel));
        }
        else if(option==2)
        {
            System.out.println("Give Temperature in Fahrenheit");
            double feh =  s.nextDouble();

            System.out.println("The Temperature in Celsius is " + getFahrenheitToCelsius(feh));
        }
    }
}
