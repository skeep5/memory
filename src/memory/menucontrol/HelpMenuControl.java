/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Brandon Larsen 
 */
public class HelpMenuControl implements DisplayInfo{
    
    public HelpMenuControl() {  
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayBorder();     
        System.out.println("\tTHE BOARD:");
        System.out.println( 
            "\tYou will be chosing cards from a field that will have various\n"
          + "\tvalues on the back of the card. You can change the size of the\n"
          + "\tfield in the game options.");
         displayBorder();
        System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayBorder();   
        System.out.println("\tTHE MEMORY GAME:");
        System.out.println( 
                 "\tThe objective of the game is to be the player with the highest"
                + "\n\tscore after finding the most matches. When all matches are"
                + "\n\tfound, player scores are tallied and the winner will be shown."
                ); 
        displayBorder();
         System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayBorder();    
        System.out.println("\tTHE PLAYER:");
        System.out.println( 
                "\tThat's you! You can change your nickname in the game options."
                ); 
        displayBorder();
         System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        enter.close();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayBorder();  
        System.out.println("\tTHE COMPUTER PLAYER:");
        System.out.println( 
                "\tThe computer based player that automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game. The"
                + "\n\tcompuer's skill level can be changed in the game options."
                ); 
        displayBorder();
         System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
             
    public void displaySelectionHelp() {
        System.out.println();
        displayBorder();    
        System.out.println("\tSELCETING A CARD:");
        System.out.println( 
               "\tTo select the cards on the field, youw will be inputing the\n"
             + "\tX and Y coordinates of the cards for your 1st and 2nd choice.\n"
             + "\tYour selection will be revieled immediately to see what you picked."
                ); 
        displayBorder();
         System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
                 
    public void displayMatchingHelp() {    
        String title = ("\tHOW MATCHING WORKS:");
        String msg =( 
               "\tCompares the two cards to see if a match is found. If a match"
           + "\n\tis found, a point is scored and the player's turn continues.\n"
           + "\tIf it's not a match, the turn passes on to the next player."
                ); 
        display(title, msg);
    }
    
    public void display(String title, String msg){
        System.out.println();
        displayBorder(); 
        System.out.println(title);
        System.out.println(msg);
        displayBorder();
         System.out.println("\t(Press Enter to continue...)");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
    
    
    public void displayBorder() {       
        System.out.println("\t===============================================================");
    }
}
