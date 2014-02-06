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
public class HelpMenuControl  {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Memory. \n "
            + "You will be chosing cards from a field that will have various\n"
            + "values on the back of the card. In order to score a point\n"
            + "you must create a match by turning over two cards of the same\n"
            + "value. The cards that are paired will then be removed from the\n"
            + "game and your turn will continue. Mispair your selection and \n"
            + "your opponent will get a turn. The player with the most pairs\n"
            + "will win the game!");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the player with the"
                + "\n\thighest score after finding the most matches. "
                + "\n\tWhen all matches are found, player scores are tallied "
                + "\n\tand the winner will be displayed."
                ); 
        displayHelpBorder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA real player manually takes their turn by selecting "
                + "\n\ttwo cards to turn over. If the player finds a match,"
                + "\n\tthey continue turning over 2 cards at a time until"
                + "\n\tthey do not find a match or all matches are found."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer based player automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game."
                ); 
        displayHelpBorder();
    }
             
    public void displaySelectionHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tChoosing the X and Y coordinates of the cards"
                ); 
        displayHelpBorder();
    }
                 
    public void displayMatchingHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tCompares the two cards to see if a match is found."
                + "\n\tIf a match is found, player's turn continues."
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}