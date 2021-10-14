package com.company;
import java.util.Scanner;

public class CWH_Array_and_multidimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*one dimensional array:

        int [] myArray = new int[5];
        for(int i=0;i<myArray.length;i++){
            System.out.printf("Enter a number for array position[%d]: ", i+1);
            myArray[i] = in.nextInt();
        }

        System.out.println("\nYou have filled your array with this numbers: ");

        for(int i=0;i<myArray.length;i++){
            System.out.printf("position [%d]: %d\n", i+1, myArray[i]);
        }*/

        /*Bi-dimensional array:
        int [][] myArray = new int[2][3];

        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray[i].length;j++){
                System.out.printf("Enter a number for position [%d][%d]: ", i+1, j+1);
                myArray[i][j] = in.nextInt();
            }
        }

        System.out.println("\nYou filled your bi-dimensional array with: ");

        for(int i=0;i< myArray.length;i++){
            for(int j=0;j< myArray[i].length;j++){
                System.out.printf("Position [%d][%d]: %d\n", i+1, j+1, myArray[i][j]);
            }
        }*/

        /*tri-dimensional array
        int [][][] myArray = new int[2][2][2];

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                for(int k=0;k<myArray[i][j].length;k++){
                    System.out.printf("Enter a number for position [%d][%d][%d]: ", i+1, j+1, k+1);
                    myArray[i][j][k] = in.nextInt();
                }
            }
        }

        System.out.println("\nYou filled your tri-dimensional array with: ");

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                for(int k=0;k<myArray[i][j].length;k++){
                    System.out.printf("Position [%d][%d][%d]: %d\n", i+1, j+1, k+1,myArray[i][j][k]);
                }
            }
        }
        */

        /*Quad-dimensional array
        int [][][][] myArray = new int[2][2][2][2];

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                for(int k=0;k<myArray[i][j].length;k++){
                    for(int l=0;l<myArray[i][j][k].length;l++) {
                        System.out.printf("Enter a number for position [%d][%d][%d][%d]: ", i + 1, j + 1, k + 1, l + 1);
                        myArray[i][j][k][l] = in.nextInt();
                    }
                }
            }
        }

        System.out.println("\nYou filled your Quad-dimensional array with: ");

        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                for(int k=0;k<myArray[i][j].length;k++){
                    for(int l=0;l<myArray[i][j][k].length;l++) {
                        System.out.printf("Position [%d][%d][%d][%d]: %d\n", i + 1, j + 1, k + 1, l + 1, myArray[i][j][k][l]);
                    }
                }
            }
        }*/


    }
}
