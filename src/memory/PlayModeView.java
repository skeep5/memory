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
public class PlayModeView {
    
    private final static String[][] menuItems = {
        {"C", "vs. Computer Player Game"}, 
        {"M", "Multiplayer Game"},
        {"Q", "Quit to Main Menu"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private PlayModeControl playModeControl = new PlayModeControl();
    
    // default constructor
    public PlayModeView() {
        
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
                case "C":
                    this.playModeControl.startComputerGame();
                    break;
                case "M":
                    this.playModeControl.startMultiplayerGame();
                    break;
                case "Q":
                    this.playModeControl.displayMainMenu();
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
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < PlayModeView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
