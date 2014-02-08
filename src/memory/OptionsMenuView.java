package memory;
import java.util.Scanner;
/**
 * @author BrandonU
 */
public class OptionsMenuView  {
    
        // private final Computer computer = new Computer();
         
    private String[][] menuItems = {
        {"N", "Change nickname (Current nickname: "+ Player.player.showName() +")"},
        {"S", "Change computer skill level (Current Level: " +Computer.computer.showComputerSkill()+ ")"}, 
        {"B", "Change board size"},
        {"C", "Clear game records"},       
        {"Q", "Quit to Main Menu"}        
    };
    
    private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    public OptionsMenuView() {
    } 
    
    public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "N":
                    this.optionsMenuControl.displayChangeNickName();
                    break;
                case "S":
                    this.optionsMenuControl.changeComputerSkillLevel();
                    break;
                case "C":
                    this.optionsMenuControl.displayResetGameRecords();
                    break;
                case "B":
                    this.optionsMenuControl.displayChangeBoardSize();
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