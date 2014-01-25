/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author BrandonU
 */
public class Computer {
    int skillLevel = 1;
    int computerWins = 0;
    int computerLoss = 0;
    
    public void showComputerSkill(){
        System.out.println("\nThe computer's skill level is "+skillLevel+".\n");
    }
    
    public void showComputerRecord(){
        System.out.println("The computer's record is "+computerWins+" wins,\n"
        +"and "+computerLoss+" losses.\n");
    }
    
    public void setComputerSkill(){
      //To ask user for new computer skill level set
    }
}
 