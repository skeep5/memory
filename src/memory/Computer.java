/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author BrandonU
 */
public class Computer {
    public static Computer computer = new Computer();
    
    //Default values for computer
    int skillLevel = 1;
    int computerWins = 0;
    int computerLoss = 0;
    int computerTies = 0;
    
    public String showComputerSkill(){
        if (skillLevel == 1){
            return "Easy";
        }
        else if (skillLevel == 2){
           return "Average";
        }
        else if (skillLevel == 3){
            return "Hard";
        }
        else if (skillLevel == 4){
            return "Extreme";
        }
        else { 
            setComputerSkill();
        }
        return null;
    }
    
    public void showComputerRecord(){
        System.out.println("The computer's record is "+computerWins+" wins,\n"
        +"and "+computerLoss+" losses.\n");
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
    
    public void setComputerSkill(){
      String newSkillLevel;
      boolean validValue = false;
      while( validValue == false){
        System.out.println(
                "\nSet computer skill level:" +
                "\n1 - Easy" +
                "\n2 - Average" +
                "\n3 - Hard"+
                "\n4 - Extreme");
        Scanner input = new Scanner(System.in);
        newSkillLevel = input.next();
        try{
        this.skillLevel = parseInt(newSkillLevel);
        }
        catch (NumberFormatException e) {
        System.out.println("\nError: Use only vaild numbers, nothing else!");
        setComputerSkill();
        break;
        }
        if (skillLevel == 1){   
            System.out.println("\nComputer Skill Level Set to: Easy");
            validValue = true;
        }
        else if (skillLevel==2){
            System.out.println("\nComputer Skill Level Set to: Average");
            validValue = true;
        }
        else if (skillLevel==3){
            System.out.println("\nComputer Skill Level Set to: Hard");
            validValue = true;
        }
        else if (skillLevel==4){
            System.out.println("\nComputer Skill Level Set to: Extreme");
            validValue = true;
        }
        else{
            System.out.println("\nInvalid Skill Level!");
            validValue = false;
        }
    }
  }
}
 