package com.vincentramdhanie.montyhall;

import java.util.Random;

/**
 *
 * @author Vincent Ramdhanie
 */
public class GameInstance {
    private int win;
    private int lose;
    private int other;
    
    /**
     * Creates a GameInstance randomly generating the 
     * win, lose and other values
     */
    public GameInstance(){
        Random ran = new Random();
        win = ran.nextInt(3) + 1;
        int a = 0, b = 0;
        switch(win){
            case 1:a = 2; b = 3;break;
            case 2:a = 1; b = 3;break;
            case 3:a = 1; b = 2;break;
        }
        if(ran.nextDouble() < 0.5){
            lose = a;
            other = b;
        }else{
            other = a;
            lose = b;
        }
    }
    
    /**
     * Creates a GameInstance with a preset win, lose, other
     * @param win
     * @param lose
     * @param other 
     */
    public GameInstance(int win, int lose, int other){
        setWin(win);
        setLose(lose);
        setOther(other);
    }
    
    @Override
    public String toString(){
        return String.format("Winning Door:%d, Other Doors:%d,%d", getWin(), getLose(), getOther());
    }

    public int findOtherNonWinningDoor(int choice){
        int ans = 0;
        if(choice == win){
            ans = other;
        }else{
            if(choice == lose){
                ans = win;
            }else{
                ans = win;
            }
        }
        return ans;
    }
    
    /**
     * @return the win
     */
    public int getWin() {
        return win;
    }

    /**
     * @param win the win to set
     */
    public void setWin(int win) {
        this.win = win;
    }

    /**
     * @return the lose
     */
    public int getLose() {
        return lose;
    }

    /**
     * @param lose the lose to set
     */
    public void setLose(int lose) {
        this.lose = lose;
    }

    /**
     * @return the other
     */
    public int getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(int other) {
        this.other = other;
    }
}
