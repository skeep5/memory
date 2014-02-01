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
    //Default values for computer
    int skillLevel = 1;
    int computerWins = 0;
    int computerLoss = 0;
    int computerTies = 0;
    
    public void showComputerSkill(){
        if (skillLevel == 1){
            System.out.println("\nComputer Skill Level Set to: Easy");
        }
        else if (skillLevel == 2){
            System.out.println("\nComputer Skill Level Set to: Average");
        }
        else if (skillLevel == 3){
            System.out.println("\nComputer Skill Level Set to: Hard");
        }
        else if (skillLevel == 4){
            System.out.println("\nComputer Skill Level Set to: Extreme");
        }
        else { 
            setComputerSkill();
        }
    }
    
    public void showComputerRecord(){
        System.out.println("The computer's record is "+computerWins+" wins,\n"
        +"and "+computerLoss+" losses.\n");
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
        skillLevel = parseInt(newSkillLevel);
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
 