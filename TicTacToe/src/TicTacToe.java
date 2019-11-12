import java.util.Scanner;
import java.util.InputMismatchException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authors Warren Dereu, Blake Ewalt and Sara Lucas
 */
public class TicTacToe {
    
    private static Scanner input = new Scanner(System.in); // Import new scanner
    private static char currentPlayer = 'X';
    private static char[][] gameBoard = new char[3][3];
    private static int row, column;
    private static boolean isFull;
    private static boolean cellOccupied = false;
    
    
     public static void main(String[] args){
         
         //to populate cells of gameBoard with dashes
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = '-';
                //System.out.println();
             }
         }
        
         game();
         
     }
     public static int game(){
         boolean gameOver = false;
       
         while (!gameOver) {
            System.out.println("Please enter a row and column: ");
            
            try {
                row = input.nextInt() -1;
                column = input.nextInt() -1;
                if (row < 0 || column < 0 || row >= 4 || column >= 4){
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }
            }
            catch (InputMismatchException  e){
                System.out.println("Invalid input; re-enter slot number:");
                break;
            }
            
            
            gameBoard[row][column] = currentPlayer;
            
            if (Winner(row,column)) {
                 gameOver = true;
                 System.out.println("Game Over!  Player " + currentPlayer 
                 + " wins!");
                 
                 break;
            }
            
            else if (BoardIsFull(row,column)) {
                isFull = true;
                System.out.println("It's a Draw!");
                
                break;
            }
            
            else  {
                cellOccupied = true;
                System.out.println("That cell has been played");
         
            }
            
            printBoard();
            
            //change player
            if (currentPlayer == 'X')
                currentPlayer = 'O';
            else
                currentPlayer = 'X';
         }
         return 0; 
     }
     
     // Method to print out gameboard
     public static void printBoard(){ 
         for (int i = 0; i < 3; i++) {
             System.out.println();
             for (int j = 0; j < 3; j++){
                 if (j == 0)
                     System.out.print ("| ");
                 System.out.print(gameBoard[i][j] + " | ");
             }
         }
         System.out.println();
     }
    
    public static boolean Winner (int rowPlay, int columnPlay) {
        //check rows for win
       if ((gameBoard[0][0] + gameBoard[0][1] + gameBoard[0][2] == currentPlayer*3) ||
           (gameBoard[1][0] + gameBoard[1][1] + gameBoard[1][2] == currentPlayer*3) ||
           (gameBoard[2][0] + gameBoard[2][1] + gameBoard[2][2] == currentPlayer*3) ||
           //check columns for win
	   (gameBoard[0][0] + gameBoard[1][0] + gameBoard[2][0] == currentPlayer*3) ||
	   (gameBoard[0][1] + gameBoard[1][1] + gameBoard[2][1] == currentPlayer*3) ||
	   (gameBoard[0][2] + gameBoard[1][2] + gameBoard[2][2] == currentPlayer*3) ||
            //check diagonal for win
	   (gameBoard[0][0] + gameBoard[1][1] + gameBoard[2][2] == currentPlayer*3) ||
	   (gameBoard[2][0] + gameBoard[1][1] + gameBoard[0][2] == currentPlayer*3))       
     return true;
        else
      return false;
    }
    
    public static boolean BoardIsFull (int rowPlay, int columnPlay) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == '-') {
                    isFull = false;
                }
                else
                    isFull = true;
            }
        }
        return isFull;
    }
    
    public static boolean SpotTaken (int rowPlay, int columnPlay) {
        if (gameBoard[rowPlay][columnPlay] != '-'){
          return cellOccupied = true;}
          
        else
          return cellOccupied = false;
        }   
    
    } //end of TicTacToe class


// Printing, Marking, and Selecting Methods - Warren


// Checking Methods  - Blake


// Counting and Switching Methods - Sara