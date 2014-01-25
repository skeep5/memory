/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Brandon
 */
public class PickCards {
    int cardChoiceOne = 0;
    int cardChoiceTwo = 0;
    
    public void showCardsChosen(){
        System.out.println("You chose card number " + cardChoiceOne + " and\n"
                + cardChoiceTwo + "for this turn.");
    }
    
    public void chooseCards(){
        //asks user to pick a card, then the 2nd card to compare but not
        //the same card as from choice one.
    }
}
