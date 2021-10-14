package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input form the user: ");
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("What is your name: ");
        a = sc.nextLine();
        System.out.println("Your name is: " + a);
        // This is for checking if the value that has been given in the input is an integer
        //System.out.print("Insert a number: ");
        //boolean isNum = sc.hasNextInt();
        //System.out.println(isNum);
    }
}
