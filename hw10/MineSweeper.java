//Ask the user to enter the size of the board (N): should be an integer between 2 and 30
//Ask the user to enter the number of mines to be placed on the board (M): between 1 and N*N
//Place mines at random locations on the board
//Use for loop to go through all cells on the board
//if mine encountered then update the # of mines that are contained in the adjacent cell

import java.lang.Math; //import random number generator
import java.util.Scanner; //import scanner that score user inputs

public class MineSweeper //public class
{
  public static void main (String[] args)// main method
  {
    int sizeBoard = 0;//initialize variable:size of board
    int numberMines = 0;//initialize variable:the number of mines
    Scanner keyboard = new Scanner(System.in);//set up scanner to score value inputs from user
    
    while (!(sizeBoard >= 2 && sizeBoard <= 30))
    {
      System.out.println("Choose what size board you would like (between 3 and 30)");//user inputs the size of board they wish to have: width and height
      sizeBoard = keyboard.nextInt();//store this value
    }
    while (!(numberMines > 0 && numberMines <= (sizeBoard*sizeBoard)))
    {
      System.out.println("Enter the number of mines you would like");//user inputs the # of mines the want in their board
      numberMines = keyboard.nextInt();//stores this value
    }
    String [][] gameBoard = new String [sizeBoard][sizeBoard];
    creator(sizeBoard, numberMines, gameBoard);//call method creator 
    printer(sizeBoard, gameBoard);//calls method printer
  }
  
  public static void creator(int n, int m, String [][] gameBoard)//another method that creates the gameboard
  {
    int mines = 0;//initialize number of mines to start at 0
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        gameBoard [i][j] = "0 ";
      }
    }
    
    while (mines < m)
    {
      int i = (int)(Math.random()*n);
      int j = (int)(Math.random()*n);
      if (gameBoard [i][j] != "M ")
      {
        gameBoard[i][j] = "M ";
        mines++;
      }
    }
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        if (gameBoard[i][j]=="M")//all cases for where the mines could be are accounted for using catch statements 
        {
          try {
            updater(gameBoard, i-1, j-1);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i-1, j);
          } catch(Exception e){}
          try {
            updater(gameBoard, i-1, j+1);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i, j-1);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i, j+1);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i+1, j-1);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i+1, j);
          } catch(Exception e) {}
          try {
            updater(gameBoard, i+1, j+1);
          } catch(Exception e) {}
        }
      }
    }
    
  }
  
  public static void updater(String [][] gameBoard, int i, int j)
  {
    switch (gameBoard[i][j])
    {
      case "0 ":
        gameBoard[i][j] = "1 ";
        break;
      case "1 ":
        gameBoard[i][j] = "2 ";
        break;
      case "2 ":
        gameBoard[i][j] = "3 ";
        break;
      case "3 ":
        gameBoard[i][j] = "4 ";
        break;
      case "4 ":
        gameBoard[i][j] = "5 ";
        break;
      case "5 ":
        gameBoard[i][j] = "6 ";
        break;
      case "6 ":
        gameBoard[i][j] = "7 ";
        break;
      case "7 ":
        gameBoard[i][j] = "8 ";
        break;
      default:
        break;
    }
  }
  public static void printer(int n, String [][] gameBoard)//method that prints out the gameboard
  {
    for (int i = 0; i<n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        System.out.print(gameBoard[i][j]);
      }
      System.out.println();
    }
  }
}