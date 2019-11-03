/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warren Dereu, Blake Ewalt, Sara Lucas
 * Date: 10/30/19
 */
import java.util.Scanner;
public class TicTacToe {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in); // Import new scanner
         
         // Character array gameboard
         char[][] gameBoard = {
         	{'1' ,  '2' , '3'},
         	{'4', '5' , '6'},
         	{'7', '8', '9'},
   	};
         printBoard(gameBoard);
         
     }
     // Method to print out gameboard
     public static void printBoard(char[][] gameboard){
         System.out.print(gameboard[0][0]);
                  System.out.print("-");
                  System.out.print(gameboard[0][1]);
                   System.out.print("-");
                  System.out.println(gameboard[0][2]);
                  System.out.print(gameboard[1][0]);
                  System.out.print("-");
                  System.out.print(gameboard[1][1]);
                  System.out.print("-");
                  System.out.println(gameboard[1][2]);
                  System.out.print(gameboard[2][0]);
                  System.out.print("-");
                  System.out.print(gameboard[2][1]);
                   System.out.print("-");
                  System.out.println(gameboard[2][2]);
     }
}

// Checking Methods

