package memory.menuview;
import java.util.Scanner;
import memory.exceptions.MenuException;
import memory.exceptions.memoryError;
import memory.menucontrol.OptionsMenuControl;
/**
 * @author BrandonU
 */
public class OptionsMenuView  {
    
        // private final Computer computer = new Computer();
         
    private String[][] menuItems = {
        {"N", "Change nickname"},
        {"S", "Change computer skill level"}, 
        {"B", "Change board size"},
        {"C", "Clear game records"},       
        {"Q", "Quit to Main Menu"}        
    };
    
    private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    public OptionsMenuView() {
    } 
    
    public void getInput() throws MenuException {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "N":
                    optionsMenuControl.displayChangeNickName();
                    break;
                case "S":
                    optionsMenuControl.changeComputerSkillLevel();
                    break;
                case "C":
                    optionsMenuControl.displayResetGameRecords();
                    break;
                case "B":
                    optionsMenuControl.displayChangeBoardSize();
                case "Q": 
                    break;
                default: 
                    new memoryError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\t                          OPTIONS MENU                           ");
        System.out.println("\tEnter the letter associated with one of the following commands:");
             for (String[] menuItem : menuItems) {
                 System.out.println("\t   " + menuItem[0] + "\t-" + menuItem[1]);
             }
        System.out.println("\t===============================================================\n");
    }
}