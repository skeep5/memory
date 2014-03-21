package memory;
/**
 * @author Brandon Larsen
 */
public class PlayMenuControl {
    
    public PlayMenuControl() {   
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
       
        public void displayBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
