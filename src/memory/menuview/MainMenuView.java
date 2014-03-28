package memory;
import memory.exceptions.memoryError;
import memory.menucontrol.MainMenuControl;
import java.util.Scanner;
/**
 * @author BrandonU
 */
public class MainMenuView  {
        
    private final static String[][] menuItems = {
        {"P", "Play Game"},
        {"O", "Game Options"}, 
        {"H", "Game Help"},   
        {"Q", "Quit Game"}        
    };
 
    private final MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
    } 
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "P":
                    this.mainMenuControl.displayPlayMode();
                    break;
                case "O":
                    this.mainMenuControl.displayOptions();
                    break;
                case "H":
                    this.mainMenuControl.displayGameHelp();
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
        System.out.println("\t                             MAIN MENU                           ");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t-" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}