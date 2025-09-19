
/*
 * Name: Destiny A. Rodriguez
 * Data: 9/17/2025
 * Purpose: This program will ask the user for the valume of the home, number of elapsed 
 * years, intrest rate. In the end the program should calculate the final value of the home 
 * and display it.
 */

//import statment for scanner
import java.util.Scanner;

public class Lab3_Destiny_Rodriguez
{
    public static void main(String [] args)
    {
        //declare a scanner
        Scanner input = new Scanner(System.in);

        //Declare the four needed variables
        double iValue;
        int years;
        double rate;
        double fValue;

        //Prompt the user to iput the initial value of the home and assign it using Scanner.
        System.out.print("Enter the initial value of the home: ");
        iValue = input.nextDouble();

        //Prompt the user to input the number of elapsed years and assign it using Scanner.
        System.out.print("Enter the number of elapsed years: ");
        years = input.nextInt();

        //Prompt the user to input the interest rate and assign it using Scanner.
        System.out.print("Enter the interest rate: ");
        rate = input.nextDouble();

        //Covert the interest rate from a percentage to a decminal(e.g., 6% = 0.06).
        rate /= 100;

        //Calculate the final value of the home using the formula for compount interest: A = P * (1 + r)^t
        fValue = 1 + rate;
        fValue = Math.pow(fValue,years);
        fValue *= iValue;

        System.out.println(fValue);
    }
}


