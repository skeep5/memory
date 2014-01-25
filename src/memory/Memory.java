/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Brandon Larsen
 */
public class Memory {

    String name;
    String instructions = "This is the Memory Game! \n\n";
    
    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
      Memory myGame = new Memory();
      myGame.getName();
      myGame.displayHelp();
      
        // TODO code application logic here
        
    }
    public void getName () {
              Scanner input = new Scanner(System.in);
              System.out.println("Enter your name: ");
              this.name = input.next();
              
        }
    public void displayHelp () {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
}
