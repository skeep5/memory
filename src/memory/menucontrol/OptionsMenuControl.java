package memory.menucontrol;

import memory.Computer;
import memory.MenuControl;
import memory.Player;

/**
 * @author BrandonU
 */
public class OptionsMenuControl extends MenuControl {
    
     private final Computer computer = new Computer();
     
    public OptionsMenuControl() {    
       // super();
    } 

    public void changeComputerSkillLevel() {
       computer.setComputerSkill();
    }
        
    public void displayChangeNickName() {
      Player.class.getName();
        //System.out.println();
        //displayBorder();     
        //System.out.println( 
         //        "Change Nickname function to be called here."
          //      ); 
        //displayBorder();
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
    
     @Override
    public void displayBorder() {       
        System.out.println("\t===============================================================");
    }
}
