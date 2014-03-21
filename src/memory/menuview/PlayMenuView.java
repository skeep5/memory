package memory;
import java.util.Scanner;
/**
 * @author Brandon Larsen
 */
public class PlayMenuView {
    
    private final static String[][] menuItems = {
        {"S", "Start Single Player Game"}, 
        {"M", "Start Multiplayer Game"},
        {"Q", "Quit to Main Menu"}        
    };
    
    private final PlayMenuControl playMenuControl = new PlayMenuControl();
    
    public PlayMenuView() {
        
    } 
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "S":
                    this.playMenuControl.startComputerGame();
                    break;
                case "M":
                    this.playMenuControl.startMultiplayerGame();
                    break;
                case "Q": 
                    break;
                default: 
                    new memoryError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\t                             PLAY MENU                           ");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : PlayMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t-" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
