/*
 * CIS220 Sample Code. The code contained here is for a programming course and
 * as such is not meant to be useful in any way. It also has a very specific 
 * and as such the design of the code may not meet production quality standards.
 * Please view/use with caution.
 */

package com.vincentramdhanie.montyhall;

import java.util.Random;

/**
 * This class implements the Monty Hall simulation is a very simple, (hopefully)
 * easy to follow manner.
 * @author Vincent Ramdhanie
 */
public class Guesser {
    public static final int MAXIMUM_ITERATIONS = 1000000;
    public static final int NUMBER_OF_DOORS = 3;

    /**
     * Simulates a single round of the game where the player does not
     * change his mind
     * @return true if the player wins, false otherwise
     */
    public boolean roundWithNoChange(){
        Random ran = new Random();
        GameInstance gi = new GameInstance();
        int initial_choice = ran.nextInt(NUMBER_OF_DOORS) + 1;
        int final_choice = initial_choice;
        return final_choice == gi.getWin();
    }
    
    /**
     * Simulate a round of the game where the player changes his mind
     * @return true if the player wins, false otherwise
     */
    public boolean roundWithChange(){
        Random ran = new Random();
        GameInstance gi = new GameInstance();
        int initial_choice = ran.nextInt(NUMBER_OF_DOORS) + 1;
        int final_choice = gi.findOtherNonWinningDoor(initial_choice);
        return final_choice == gi.getWin();
    }
    
    public void runSimulation(){
        int winsWithChange = 0;
        int winsWithNoChange = 0;
        for(int i = 1; i < MAXIMUM_ITERATIONS; i++){
            winsWithChange += roundWithChange()?1:0;
            winsWithNoChange += roundWithNoChange()?1:0;
        }
        
        double pWithChange = ((double)winsWithChange/(double)MAXIMUM_ITERATIONS) * 100d;
        double pNoChange = ((double)winsWithNoChange/(double)MAXIMUM_ITERATIONS) * 100d;
        
        System.out.printf("%.2f probability of winning with no change\n%.2f probability of winning with change.\n",pNoChange, pWithChange);
    }
 
    public static void main(String args[]){
        new Guesser().runSimulation();
    }
    
}
