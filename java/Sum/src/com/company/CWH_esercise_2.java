package com.company;
import java.util.Scanner;

public class CWH_esercise_2 {
    public static void main(String[] args) {
        /*Make the game rock paper scissors*/
        Scanner input = new Scanner(System.in);

        String player1, player2;

        System.out.print("Player one enter your decision: ");
        player1 = input.next();
        System.out.print("Player two enter your decision: ");
        player2 = input.next();

        if(player1.equals(player2)) {
            System.out.print("Nobody wins!");
        } else if(player1.equals("rock") && player2.equals("paper")){
            System.out.print("Player 2 wins");
        } else if(player1.equals("rock") && player2.equals("scissors")){
            System.out.print("Player 1 wins");
        } else if(player1.equals("paper") && player2.equals("scissors")){
            System.out.print("Player 2 wins");
        } else if(player1.equals("paper") && player2.equals("rock")){
            System.out.print("player 1 wins");
        } else if(player1.equals("scissors") && player2.equals("rock")){
            System.out.print("Player 2 wins");
        } else if(player1.equals("scissors") && player2.equals("paper")){
            System.out.print("player 1 wins");
        }

    }
}
