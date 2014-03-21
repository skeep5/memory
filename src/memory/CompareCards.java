/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;

/**
 *
 * @author BrandonU
 */
public class CompareCards implements Serializable {
    private int cardOneValue = 0;
    private int cardTwoValue = 0;
    
    public CompareCards() {
    }

    public int getCardOneValue() {
        return cardOneValue;
    }

    public void setCardOneValue(int cardOneValue) {
        this.cardOneValue = cardOneValue;
    }

    public int getCardTwoValue() {
        return cardTwoValue;
    }

    public void setCardTwoValue(int cardTwoValue) {
        this.cardTwoValue = cardTwoValue;
    }
    
    
    
    
    public void showCardValues(){
        System.out.println("Card One Value: " + cardOneValue + "\n"
        + "Card Two Value: " + cardTwoValue);
    }
    private int getCardOneVaule(){
        return 3; //function for pulling from a preset of array for the cards
    }
    private int getCardTwoVaule(){
        return 7;//same fuction as above for card number two.
    }
    
    public void compareCardValues(){
        //Function to compare the card values to see if there's a match
    }
}
