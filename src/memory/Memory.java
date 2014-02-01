/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;    

import java.util.Scanner;

/**
 *
 * @author Brandon^2
 */
public class Memory {
    String name;
    String instructions = "This game is a memory game!\n\n"
            + "You will be chosing cards from a field that will have various\n"
            + "values on the back of the card. In order to score a point\n"
            + "you must create a match by turning over two cards of the same\n"
            + "value. The cards that are paired will then be removed from the\n"
            + "game and your turn will continue. Mispair your selection and \n"
            + "your opponent will get a turn. The player with the most pairs\n"
            + "will win the game!";
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Memory myGame = new Memory();
        Player player = new Player();
        Board board = new Board();
        Card card = new Card();
        Computer computer = new Computer();
        CompareCards compare = new CompareCards();
        PickCards pick = new PickCards();
        
        myGame.getName();
        myGame.displayHelp();
        System.out.println("\nYour current winning percentage is: " + player.getWinningPercentage(4, 0, 3) + "%");
           
        
    }
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your nickname: ");
        this.name = input.next();
        
    }
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + ",\n");
        System.out.println(this.instructions);
    }
    
}
