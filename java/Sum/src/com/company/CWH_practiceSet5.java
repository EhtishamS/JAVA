package com.company;
import java.util.Scanner;

public class CWH_practiceSet5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Question 1: write a program to print the following pattern:
        ****
        ***
        **
        *


        char symbol = '*';
        for(int i=4;i>0; i--){
            for(int j=i;j>0;j--){
                System.out.print(symbol);
            }
            System.out.print("\n");
        }*/

        /*Question 2: write a program to sum first n even numbers using while loop.

        System.out.print("Enter how many even number you want to sum: ");
        int n = in.nextInt(), sum = 0, i = 0;

        while(i<n) {
            sum += (2 * i);
            i++;
            System.out.println("The sum of first " + n + " even number is: " + sum);
        }*/

        /*Question 3: Write a program to print multiplication table of a given number n
        int n;
        System.out.print("Enter a number: ");
        n = in.nextInt();

        for(int i=1;i<=10;i++){
            System.out.print(n*i);
            System.out.print("\n");
        }*/

        /*Question 4: Write a program to print multplication table of 10 in reverse order.
        for(int i=10;i>0;i--){
            System.out.print(10*i);
            System.out.print("\n");
        }*/

        /*Question 5: Write a program to find factorial of a given number using for loops.
        int n, factorial = 1;
        System.out.print("Enter a number: ");
        n = in.nextInt();

        for(int i=2; i<=n; i++){
            factorial *= i;
        }
        System.out.print("factorial of " + n +" is equal to: " + factorial);*/

        /*Question 6: do the same thing using while loops
        int n, factorial = 1, i = 2;
        System.out.print("Enter a number: ");
        n = in.nextInt();

        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.print("factorial of " + n +" is equal to: " + factorial);*/

        /*Question 7: do same thing that you did in the first program but using for/while loops
        int j;
        char symbol = '*';
        for(int i=4;i>0; i--) {
            j = i;
            while (j > 0) {
                System.out.print(symbol);
                j--;
            }
            System.out.print("\n");
        }*/

        /*Question 9: write a program to calculate the sum of the numbers occuring in the moltiplication table of 8.
        int sum = 0;

        for(int i = 8; i<=(8*10); i+=8){
            sum += i;
        }

        System.out.print(sum);*/

        /*Question 10: remake the same program that you made in question 2 but with for loop

        System.out.print("Enter how many even number you want to sum: ");
        int n = in.nextInt(), sum = 0, i = 0;

        for(;i<n;i++){
            sum += (2*i);
        }

        System.out.println("The sum of first " + n + " even number is: " + sum);*/
    }
}
