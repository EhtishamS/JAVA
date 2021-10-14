package com.company;
import java.util.Scanner;

public class CWH_practiceSet6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Question 1: create an array of 5 floats and calculate their sum
        float [] myArray = new float[5];
        float sum = 0.0f;

        for(int i=0;i<myArray.length;i++){
            System.out.printf("Enter a number for position [%d]: ", i+1);
            myArray[i] = in.nextFloat();
        }

        // in this case i'm assigning to v the value of myArray but one after another so it works like other
        for (float v : myArray) {
            sum += v;
        }

        System.out.printf("The summary of all number is: %.1f", sum);*/

        /*Question 2: write a program to find out whether a given number is present in the array (integer)

        int [] myArray = {100,3,5,2,4,1,6};
        int srcNumber;
        boolean present = false;

        System.out.print("Enter the number that you want to check if it is in the array of not: ");
        srcNumber = in.nextInt();

        for(int i : myArray){
            if(i == srcNumber){
                System.out.print("The number is present");
                present = true;
                break;
            }
        }

        if(!present){
            System.out.print("The number is not present");
        }*/

        /*Question 3: Calculate the average marks from an array containing marks of all students in Physics using for each loop
        int[] myArray = {5,7,8,6,9,7,8,6,9,3};
        int sum=0;
        float average;

        for (int i : myArray){
            sum += i;
        }
        average = (float) sum/myArray.length;
         */

        /*Question 4: Create a java program to add two matrices of size 2x3

        int[][] mat1 = {{1,2,3},
                        {4,5,6}};
        int[][] mat2 = {{2,4,10},
                        {1,5,15}};
        int[][] summary = new int[2][3];

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                summary[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("\nSummary table: ");

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                System.out.printf("%d\t", summary[i][j]);
            }
            System.out.print("\n");
        }*/

        /*Question 5: reverse the content of an array

        int [] revArr = {1,2,3,4,5,6,7};
        int temp;

        System.out.println("\nArray before the reverse process: ");

        for (int j : revArr) {
            System.out.printf("%d ", j);
        }

        for(int i=0;i<revArr.length/2;i++){
            temp = revArr[i];
            revArr[i] = revArr[revArr.length-(i+1)];
            revArr[revArr.length-(i+1)] = temp;
        }

        System.out.println("\nArray after the reverse process: ");

        for (int j : revArr) {
            System.out.printf("%d ", j);*/

        /*Question 6: find the maximum in an array
        int [] arr = {1,3,6,10,22,1,4};
        int max = arr[0];

        for (int i : arr) {
            if (max < i)
                max = i;
        }

        System.out.print("The maximum number present in the array is: " + max);*/

        /*Question 7: find the minimum in an array
        int[] arr = {1,3,6,10,22,1,4};
        int min = arr[0];

        for (int i:  arr){
            if(min > i)
                min = i;
        }

        System.out.print("The minimum number present in the array is: " + min);*/

        /*Question 8: Write a java program to find whether an array is sorted or not
        int [] arr = {1,2,3,4,5,6};
        boolean sorted = true;

        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }

        if(!sorted)
            System.out.print("The array is not sorted!");
        else
            System.out.print("The array is sorted!");*/

    }
}
