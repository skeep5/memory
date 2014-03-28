/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import memory.exceptions.memoryError;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import memory.exceptions.MenuException;

/**
 *
 * @author BrandonU
 */
public class Computer implements Serializable {
       
    private int skillLevel = 1;
    private int computerWins;
    private int computerLoss;
    private int computerTies;

    public Computer() {
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public void setComputerWins(int computerWins) {
        this.computerWins = computerWins;
    }

    public int getComputerLoss() {
        return computerLoss;
    }

    public void setComputerLoss(int computerLoss) {
        this.computerLoss = computerLoss;
    }

    public int getComputerTies() {
        return computerTies;
    }

    public void setComputerTies(int computerTies) {
        this.computerTies = computerTies;
    }
    
    
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
    
    private float getWinningPercentage(int wins, int losses, int ties){
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
            new memoryError().displayError("Use only vaild numbers, nothing else!");
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
            new memoryError().displayError("Invalid Skill Level!");
            validValue = false;
        }
    }
  }
}
 