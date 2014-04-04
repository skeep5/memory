/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;    

import Frames.MainFrame;
import java.util.Scanner;
import java.lang.Throwable;
import java.lang.Error;

/**
 *
 * @author Brandon^2
 */
public class Memory {
    private static MainFrame mainFrame;
      
     String instructions = 
              "\t==================================================================\n"
            + "\t                          THE MEMORY GAME\n"
            + "\tYou will be chosing cards from a field that will have various\n"
            + "\tvalues on the back of the card. In order to score a point\n"
            + "\tyou must create a match by turning over two cards of the same\n"
            + "\tvalue. The cards that are paired will then be removed from the\n"
            + "\tgame and your turn will continue. Mispair your selection and \n"
            + "\tyour opponent will get a turn. The player with the most pairs\n"
            + "\twill win the game!\n"
            + "\t==================================================================\n";
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            Memory memory = new Memory();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Memory.mainFrame = new MainFrame();
                    
                    Memory.mainFrame.setVisible(true);
                    
                }
            });
        }
        
        catch(Throwable ex){
          
    //    Error.displayErorrMsg("Unexpected error: " + ex.getMessage());
     //   Error.displayErorrMsg(ex.getStackTrace().toString());
            
        }
        finally{
           if (Memory.mainFrame != null) {
               Memory.mainFrame.dispose();
           }
        }
        
      
        }

    public void displayIntro(){
        System.out.println(this.instructions);
    }
    
}
