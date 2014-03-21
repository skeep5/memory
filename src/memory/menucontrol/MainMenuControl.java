package memory.menucontrol;

import memory.menuview.HelpMenuView;
import memory.menuview.OptionsMenuView;
import memory.menuview.PlayMenuView;

/**
 * @author BrandonU
 */
public class MainMenuControl  {
    
    private final HelpMenuView helpMenuView = new HelpMenuView();
    private final OptionsMenuView optionsMenuView = new OptionsMenuView();
    private final PlayMenuView playMenuView = new PlayMenuView();
    
    public MainMenuControl() {
        
    } 

    public void displayPlayMode() {
        this.playMenuView.getInput();
    }
    
    
        
    public void displayGameHelp() {
        this.helpMenuView.getInput();
    }
            
    public void displayOptions() {
        this.optionsMenuView.getInput();
    } 
}