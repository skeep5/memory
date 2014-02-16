/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Brandon Larsen initially created this class
 */
public class Player {
    //public static Player player = new Player();
    int gameWins;
    int gameLosses;
    public String name = "Player1";
    
    //from here down coded by Brandon Urednick
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your nickname: ");
        this.name = input.next();
    }
    
    public String showName(){
        return this.name;
    }
    
    public void winsDisplay () {

        System.out.println(gameWins);
              
        }
    public void lossesDisplay () {

       System.out.println(gameLosses);
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
