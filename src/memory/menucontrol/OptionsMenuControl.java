package memory.menucontrol;

import memory.Computer;
import memory.MenuControl;
import memory.Player;
import memory.exceptions.MenuException;

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
        
    public void displayChangeNickName() throws MenuException {
      String name = Player.class.getName();
      if (name == null){
          throw new MenuException("There is no vaild name!");
      }
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
