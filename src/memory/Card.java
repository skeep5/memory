/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;

/**
 *
 * @author Brandon Larsen
 */
public class Card implements Serializable {
    
    private int positionX;
    private int positionY;
    private int numCards = 10;
    private int deck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int deck2[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
    private boolean isPaired[] = {false, false, false, false, false, false, false, false, false, false}; 
    private String cardCharacter;

    public Card() {
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    public int[] getDeck() {
        return deck;
    }

    public void setDeck(int[] deck) {
        this.deck = deck;
    }

    public int[] getDeck2() {
        return deck2;
    }

    public void setDeck2(int[] deck2) {
        this.deck2 = deck2;
    }

    public boolean[] getIsPaired() {
        return isPaired;
    }

    public void setIsPaired(boolean[] isPaired) {
        this.isPaired = isPaired;
    }

    public String getCardCharacter() {
        return cardCharacter;
    }

    public void setCardCharacter(String cardCharacter) {
        this.cardCharacter = cardCharacter;
    }
    
    public void assignCardValues(){
        for(int x : deck){
            deck[x]= (int) (Math.random()*10);
        }
    }
    
    //For purposes of the lesson
    public int sumOfCardValues(){
        int sum = 0;
        for(int x : deck2){
            sum+=x;
        }
        return sum;
    }
    
    public void checkValidDeck(){
        System.out.println("Deck checksum is: " + sumOfCardValues());
     if (sumOfCardValues()== 30){
         System.out.println("\tDeck is VALID!");}
     else{System.out.println("\tDeck is INVALID!");
    }
    }
    
    //end of L06 code
    
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
                 System.out.println("Card "+ (i+1) + " value: " + deck2[i]);
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
    
    
