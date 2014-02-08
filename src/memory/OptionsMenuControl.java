package memory;
/**
 * @author BrandonU
 */
public class OptionsMenuControl  {
    
     //private final Computer computer = new Computer();
     
    public OptionsMenuControl() {    
    } 

    public void changeComputerSkillLevel() {
        Computer.computer.setComputerSkill();
    }
        
    public void displayChangeNickName() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                 "Change Nickname function to be called here."
                ); 
        displayBorder();
    }
            
    public void displayResetGameRecords() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "Resets Game Records here."
                ); 
        displayBorder();
    }
    
    public void displayChangeBoardSize() {
        System.out.println();
        displayBorder();     
        System.out.println( 
                "Changes Board size, calls for function."
                ); 
        displayBorder();
    }
    
    public void displayBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}