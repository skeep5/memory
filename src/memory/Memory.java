/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;    

import java.util.Scanner;

/**
 *
 * @author Brandon^2
 */
public class Memory {
      
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
       // Memory memory = new Memory();
       Player player = new Player();
       // MainMenuView mainMenu = new MainMenuView();
      //  memory.displayIntro();
       // mainMenu.getInput();
        //Card card = new Card();
       // card.displayCardValues();
      //  card.displayIsPaired();
       player.highScore(); 
        }

    public void displayIntro(){
        System.out.println(this.instructions);
    }
    
}
