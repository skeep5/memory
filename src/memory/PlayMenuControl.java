package memory;
/**
 * @author Brandon Larsen
 */
public class PlayMenuControl extends MenuControl {
    
    public PlayMenuControl() {   
       // super();
    } 

        public void startComputerGame() {
            System.out.println();
        displayBorder();     
        System.out.println( 
                "Starts computerGame();"
                ); 
        displayBorder();
        }
        
        public void startMultiplayerGame() {
            System.out.println();
        displayBorder();     
        System.out.println( 
                "stars multiplayerGame();"
                ); 
        displayBorder();
        }
       
    @Override
        public void displayBorder() {       
       System.out.println("\t===============================================================");
    }
}
