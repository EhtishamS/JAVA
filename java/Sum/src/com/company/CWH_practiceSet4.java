package com.company;
import java.util.Scanner;

public class CWH_practiceSet4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Question 1: What will be the output of this program:
        int a = 10
        if(a = 11)
            System.out.println("I'm 11");
        else
            System.out.println("I'm not 11");
         Answer: It will be always truth because we are using an assignment operator so it will assign and it will not check
         */

        /*Question 2: Write a program to find out whether a student is pass or fail: if it requires total 40% and at least
        33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.
        float sub1, sub2, sub3;
        System.out.print("Enter you percentage for first subject: ");
        sub1 = input.nextFloat();
        System.out.print("Enter you percentage for second subject: ");
        sub2 = input.nextFloat();
        System.out.print("Enter you percentage for third subject: ");
        sub3 = input.nextFloat();
        float total = (sub1+sub3+sub3)/3.0F;
        if(sub1>= 33.0 && sub2>= 33.0 && sub3>= 33.0 && total>=40.0){
            System.out.print("You are passed!");
        } else {
            System.out.println("You are failed!");
        }*/

        /*Question 3: Calculate the income tax paid by an employee to the government as per the slabs mentioned below:
        income slabs:       TAX:
        2.5L - 5.0 L        5%
        5.0L - 10.0L        20%
        above 10.0L         30%

        float salary;
        System.out.print("Enter the income that you receive: ");
        salary = input.nextFloat();

        if(salary<2.5)
            System.out.print("You don't have to pay any tax!");
        else if(salary>=2.5 && salary<5.0)
            System.out.print("You have to pay 5% of the tax!");
        else if(salary>=5.0 && salary<10.0)
            System.out.print("You have to pay 20% of the tax!");
        else
            System.out.print("You have to pay 30% of the tax");*/

        /*Question 4: write a Java program to find out the day of the week given the number 1 for Monday, 2 for Tuesday, etc...*/
        int number;

        System.out.print("Enter a number (1-7): ");
        number = input.nextInt();

        switch (number){
            case 1:
                System.out.print("Monday!");
                break;
            case 2:
                System.out.print("Tuesday!");
                break;
            case 3:
                System.out.print("Wednesday!");
                break;
            case 4:
                System.out.print("Thursday!");
                break;
            case 5:
                System.out.print("Friday!");
                break;
            case 6:
                System.out.print("Saturday!");
                break;
            case 7:
                System.out.print("Sunday!");
                break;
            default:
                System.out.print("Invalid number!");
                break;
        }
    }
}
