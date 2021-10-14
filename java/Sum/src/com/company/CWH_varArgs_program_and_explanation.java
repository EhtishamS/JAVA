package com.company;

public class CWH_varArgs_program_and_explanation {
    // basically writing like this it will make it as an array like this: int [] arr;
    static int sum(int ...arr){
        int result = 0;
        for(int i : arr){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        /*Sum as many number as you want without putting a limit on it*/
        System.out.println("Sum of 1 and 2 numbers: " + sum(1,2));
        System.out.println("Sum of 1 and 2 and 3 numbers: " + sum(1,2,3));
        System.out.println("Sum of 1 and 2 and 3 and 4numbers: " + sum(1,2,3,4));
        System.out.print("Sum of 1 and 2 and 3 and 4 and 5 numbers: " + sum(1,2,3,4,5));
    }
}
