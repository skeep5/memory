/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author BrandonU
 */
public class CompareCards {
    int cardOneValue = 0;
    int cardTwoValue = 0;
    
    public void showCardValues(){
        System.out.println("Card One Value: " + cardOneValue + "\n"
        + "Card Two Value: " + cardTwoValue);
    }
    public int getCardOneVaule(){
        return 3; //function for pulling from a preset of array for the cards
    }
    public int getChardTwoVaule(){
        return 7;//same fuction as above for card number two.
    }
    
    public void compareCardValues(){
        //Function to compare the card values to see if there's a match
    }
}
