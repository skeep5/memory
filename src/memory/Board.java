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
public class Board implements Serializable {
    
    private int boardWidth;
    private int boardHeight;
     
    public Board() {
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }
    
    
   
    public void boardWidthDisplay () {

        System.out.println(boardWidth);
              
        }
    private void boardHeightDisplay () {

        System.out.println(boardHeight);
    }
    
    private float boardDimensions () {
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
