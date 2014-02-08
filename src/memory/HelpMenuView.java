/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import java.util.Scanner;



/**
 *
 * @author BrandonU
 */
public class HelpMenuView  {
        
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "The computer player"}, 
        {"G", "The Memory game"},
        {"S", "Selceting a card"},
        {"M", "How matching works"},
        {"R", "The player"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "S":
                    this.helpMenuControl.displaySelectionHelp();
                    break;
                case "M":
                    this.helpMenuControl.displayMatchingHelp();
                    break;
                 case "R":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    new memoryError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
       System.out.println("\n\t===============================================================");
        System.out.println("\t                             HELP MENU                           ");
        System.out.println("\tEnter the letter associated with one of the following commands");
        System.out.println("\tto learn more about that specific part of the game:");
        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t-" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}