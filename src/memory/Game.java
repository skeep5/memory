/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class Game {
    static int deck[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 6, 5, 4, 3, 2, 1};
    static int match[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int pick1;
    static int pick2;
    
    public static void setPick1(int num){
        pick1 = num;
    }                                                                                                                                                                                                                                                                                                   
    
    public static void setPick2(int nums){
        pick2 = nums;
    }
   
    public static int getValue(int n){
        return deck[n];
    }
    
    public static String checkMatch(){
        if(deck[pick1]==1){
            return "picked1";
        }
        else if(deck[pick2]==2){
            return "picked2";
        }
        else if(deck[pick1]==deck[pick2]){
            match[pick1]=1;
            match[pick2]=1;
            return "match";
        }
        else{
        return "no";
          }
    }
    
    
         }
        
    
        
        
   
