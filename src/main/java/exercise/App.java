package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are a female: ");
        String firstString = input.next();
        int gender = Integer.parseInt(firstString);

        System.out.print("How many ounces of alcohol did you have? ");
        String secondString = input.next();
        int ounces = Integer.parseInt(secondString);

        System.out.print("What is your weight, in pounds? ");
        String thirdString = input.next();
        int weight = Integer.parseInt(thirdString);

        System.out.print("How many hours has it been since your last drink? ");
        String fourthString = input.next();
        int hours = Integer.parseInt(fourthString);

        if( gender == 1){

            double maleBAC = (ounces * 5.14 / weight * 0.73) - .015 * hours;

            if(maleBAC < 0.08){
                System.out.println("Your BAC is " + String.format("%.6f", maleBAC) + "\n" + "It is legal for you to drive.");

            }
            else{
                System.out.println("Your BAC is " + String.format("%.6f", maleBAC) + "\n" + "It is not legal for you to drive.");

            }
        }
        else if( gender == 2){

            double femaleBAC = (ounces * 5.14 / weight * 0.66) - .015 * hours;

            if(femaleBAC < 0.08){
                System.out.println("Your BAC is " + String.format("%.6f", femaleBAC) + "\n" + "It is legal for you to drive.");

            }
            else{
                System.out.println("Your BAC is " + String.format("%.6f", femaleBAC) + "\n" + "It is not legal for you to drive.");

            }
        }






    }
}
