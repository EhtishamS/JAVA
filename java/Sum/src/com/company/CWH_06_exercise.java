package com.company;
import java.util.Scanner;

public class CWH_06_exercise {

    public static float percentageCalc(float marks){
        return (marks/5)*10;
    }

    public static float input(int subNumber){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark subject "+subNumber+": ");
        return sc.nextFloat();
    }

    public static void main(String[] args) {
        float sub1, sub2, sub3, sub4, sub5, percentage;

        System.out.println("CBSE percentage calculator: ");
        sub1 = input(1);
        sub2 = input(2);
        sub3 = input(3);
        sub4 = input(4);
        sub5 = input(5);

        percentage = percentageCalc(sub1+sub2+sub3+sub4+sub5);

        System.out.println("You mark in CBSE paper is: " + percentage + "%");
    }
}
