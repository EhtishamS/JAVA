package com.company;
import java.util.Scanner;

public class CWH_practiceSet7 {
//    normal version (Q1)
//    static void table(int n){
//        for(int i=1;i<=10;i++){
//            System.out.println(n + " x " + i + " = " + n*i);
//        }
//    }

//    version with the iteration (Q1)
//    static void table(int n, int i){
//        if(i<=10){
//            System.out.println(n + " x " + i + " = " + n*i);
//            table(n,i+=1);
//        }
//    }

    /*printing the * (Q2)
    static void printStar(){
        char star = '*';

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
                System.out.print(star);
            System.out.print("\n");
        }
    }*/

    /*calcolate sum but with recursive function (Q3)
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-=1);
    }*/
    /* (Q4)
    static void printStarReverse(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--)
                System.out.print("*");
            System.out.print("\n");
        }
    }*/

    /*Fibonacci single number printer
    static int printFibonacci(int numSequence){
        if(numSequence==1){
            return 0;
        } else if(numSequence == 2){
            return 1;
        } else{
            return printFibonacci(numSequence-1) + printFibonacci(numSequence-2);
        }
    }*/

    /*Average calculater
    static float average(int[] arr){
        float result = 0;

        for(int i : arr){
            result += i;
        }

        return result/arr.length;
    }*/

    /*Question 7
    static void printStar(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.print("\n");
            printStar(n-1);
        }
    }*/

    /*Question 8
    static void printStar(int n){
        if(n>0){
            printStar(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }*/

    /*Question 9

     static float celsiusToFahrenheit(int temperature){
        return (temperature * 1.8f) + 32;
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Question 1: Write a method to print the table of a number n:
        int n;
        System.out.print("Enter the number that you want: ");
        n = in.nextInt();
        table(n,1);*/

        /*Question 2: write  program using functions to print the following pattern:
        *
        **
        ***
        ****
        printStar();*/

        /*Question 3: Write a recursive function to calculate sum of first n natural numbers
        int n, result;

        System.out.print("Enter a number: ");
        n = in.nextInt();

        result = sum(n);
        System.out.print("The sum is: " + result);*/

        /*Question 4: write a function to print the following pattern:
        ****
        ***
        **
        *

        printStarReverse();*/

        /*Question 5: write a function to print N th turn of fibonacci series using fibonacci
        int numSequence, result;
        System.out.print("Enter the number that you want from the fibonacci sequence: ");
        numSequence = in.nextInt();

        System.out.print("the result is: " + printFibonacci(numSequence));*/

        /*question 6: Write a function to find average of a set of numbers passed as arguments
        int[] setOfNumbers;
        int n;

        System.out.print("How many numbers you want to give in input: ");
        n = in.nextInt();

        setOfNumbers = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter a number [%d]: ", i+1);
            setOfNumbers[i] = in.nextInt();
        }

        System.out.print("\nThe average is: " + average(setOfNumbers));*/

        /*Question 7: Do the exercise 4 using recursion methods
        printStar(4);*/

        /*Question 8: do again the exercise 2 using recursion method
        printStar(4);*/

        /*Question 9: make a methods that convert celsius in fahrenheit
        int temperature;

        System.out.print("Enter the temperature: ");
        temperature = in.nextInt();

        System.out.println("The temperature in fahrenheit is: " + celsiusToFahrenheit(temperature) + "F");*/

        /*Question 10: Do the question 10 using iterative approach

        int n;
        int sum = 0;

        System.out.print("Enter a number: ");
        n = in.nextInt();

        for(int i=1;i<=n;i++)
            sum += i;

        System.out.print("The sum of the first " + n + " number is: " + sum);*/
    }
}
