/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Brandon Larsen
 */
public class Card {
    
    int positionX;
    int positionY;
    int numCards = 10;
    int deck[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
    boolean isPaired[] = {false, false, false, false, false, false, false, false, false, false}; 
    String cardCharacter;
    
    public void assignCardValues(){
        for(int x : deck){
            deck[x]=(int) Math.random();
        }
    }
    
    public void positionXDisplay () {

        System.out.println(positionX);
              
        }
    public void positionYDisplay () {

        System.out.println(positionY);
    }
    
    public void cardCharacterDisplay () {

        System.out.println(cardCharacter);
    }
    
    public void displayCardValues(){
        for (int i =0;i<numCards;i++){
                 System.out.println("Card "+ (i+1) + " value: " + deck[i]);
        }
    }
    
    public void displayIsPaired(){
        for (int i = 0; i<numCards;i++){
            System.out.println("Card " + (i+1) +" "+ isCardPaired(i) + " paired.");
        }
    }
    
    public String isCardPaired(int card){
        if (isPaired[card] == false){
        return "IS NOT";}
        else{return "IS";}
    }
        
}
    
    
