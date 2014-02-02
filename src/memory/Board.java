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
public class Board {
    int boardWidth;
    int boardHeight;
     
    public void boardWidthDisplay () {

        System.out.println(boardWidth);
              
        }
    public void boardHeightDisplay () {

        System.out.println(boardHeight);
    }
    
    public float boardDimensions () {
       int boardSize = boardWidth * boardHeight;
       if (boardWidth < 1) {
        System.out.println("There's something wrong with your board width. "); 
       } else if (boardHeight < 1) {
        System.out.println("There's something wrong with your board width. "); 
       } else {
       System.out.println("Your board size is " + boardWidth + "\n * " 
               + boardHeight + "= " + boardSize);
       }
       return boardSize;
}
    
}
