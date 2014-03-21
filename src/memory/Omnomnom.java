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
public enum Omnomnom {
    CONTINUE ("CONTINUE"),
    NEW_GAME ("NEW_GAME"),
    PLAYING ("PLAYING"),
    WINNER ("WINNER"),
    TIE ("TIE"),
    QUIT ("QUIT"),
    ERROR ("ERROR"),
    EXIT ("EXIT");
            
String value;

Omnomnom(String value) {
    this.value = value;    
}

public String getValue(){
        return value;
}
}