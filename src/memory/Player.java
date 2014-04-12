/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Brandon Larsen initially created this class
 */
public class Player implements Serializable{
    private int gameWins;
    private int gameLosses;
    private int gameDraws;
    private static String playerName;
    private static String name = null ;

    private class Score{
        
        int score;
        int highScore[];
    
    public void sortHighScore(int highScore[]){
     int i, j, first, temp;  
     for (i=highScore.length-1; i>0; i--)  
     {
          first = 0;
          for(j = 1; j <= i; j ++)
          {
               if( highScore[j] < highScore[first] )         
                 first = j;
          }
          temp = highScore[ first ];
          highScore[first] = highScore[i];
          highScore[i] = temp; 
      }  
    }
    
    public void highScore(){
        checkHighScore(highScore, 65);
    }
    
    public void enterHighScore(int score, int length){
       Scanner input = new Scanner(System.in);
       //highScoreName[length] = input.next();
       highScore[length-1] = score;  
    }
    
    public void checkHighScore(int hScore[], int score){
        int length = hScore.length;
        
        System.out.println("\n\tHigh Score List before new score is added,\n"
                         + "\tthe array is unsorted.");
        displayHighScore(hScore);
        
        System.out.println("\n\tHigh Score List before new score is added,\n"
                         + "\tthe array is sorted.");
        sortHighScore(hScore);
        displayHighScore(hScore);
        if (hScore[length-1] < score){
            
        System.out.println("\n\tHigh Score List after new score is added,\n"
                         + "\tthe array is not sorted.");
            enterHighScore(score, length);
            displayHighScore(hScore);
           
            sortHighScore(hScore);
            System.out.println("\n\tHigh Score List After new score is added\n"
                         + "\tthen resorted in the array.");
            displayHighScore(hScore);
        }
        }
    
    public void displayHighScore(int gameHighScore[]){
        for (int i =0;i<gameHighScore.length;i++){
                 
                 System.out.println("\t#" + (i+1) + " High Score: " + gameHighScore[i]);
        }        
    }
        
    }
    
    public Player() {
    }

    public static void setPlayerName(String pName){
        playerName = pName;
    }
    public int getGameWins() {
        return gameWins;
    }

    public void setGameWins(int gameWins) {
        this.gameWins = gameWins;
    }

    public int getGameLosses() {
        return gameLosses;
    }

    public void setGameLosses(int gameLosses) {
        this.gameLosses = gameLosses;
    }

    public int getGameDraws() {
        return gameDraws;
    }

    public void setGameDraws(int gameDraws) {
        this.gameDraws = gameDraws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Player.name = name;
    }
    
    public void createName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your nickname: ");
        Player.name = input.next();
    }
    
    public String showName(){
        return Player.name;
    }
    
    public float getWinningPercentage(int wins, int losses, int ties){
        int winningPercentage = 0;
        
        if (wins<0){
            winningPercentage = -999;
            System.out.println("\nInvaild number of wins!");
            return winningPercentage;     
        }
        else if (losses<0){
            winningPercentage = -999;
            System.out.println("\nInvaild number of losses!");
            return winningPercentage;   
        }
        else if (ties<0){
            winningPercentage = -999;
            System.out.println("\nInvaild number of ties!");
            return winningPercentage;   
        }
        else {
            int gamesPlayed = wins + losses + ties;
            if (gamesPlayed==0){
                
                System.out.println("\nYou have no games played!");
                return winningPercentage;
                }
            else {
                 float w = wins;
                 float g = gamesPlayed;
                 float calculatedPercentage = Math.round((w/g)*100);
                 return calculatedPercentage;
                }
            }
    }
    
}
