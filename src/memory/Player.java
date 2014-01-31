/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Brandon Larsen
 */
public class Player {

    int wins;
    int losses;
    
    
    public void winsDisplay () {

        System.out.println(wins);
              
        }
    public void lossesDisplay () {

        System.out.println(losses);
    }
    
    public int getWinningPercentage(int wins, int losses, int ties){
        int gamesPlayed = wins + losses + ties;
        int winningPercentage = 0;
        
        if (wins<0){
            winningPercentage = -999;
            System.out.println("Invaild number of wins!");
            return winningPercentage;     
        }
        else if (losses<0){
            winningPercentage = -999;
            System.out.println("Invaild number of losses!");
            return winningPercentage;   
        }
        else if (ties<0){
            winningPercentage = -999;
            System.out.println("Invaild number of ties!");
            return winningPercentage;   
        }
        else {
            winningPercentage = Math.round((wins)/(gamesPlayed));
            return winningPercentage;
        }
    }
    
}
