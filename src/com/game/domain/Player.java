package com.game.domain;

import static com.game.literals.GameLiterals.*;

/**
 * Created by Saurabh on 06-08-2015.
 */
public class Player {

    protected String playerName;

    protected int position;
    Dice dice = new Dice();

    public Player() {
    }

    public Player(String playerName) {
        this.playerName = playerName;
        this.position = START_POINT;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public boolean isWon(){

        if(this.getPosition()>=(BOARD_HORIZONTAL_LENGTH * BOARD_VERTICAL_LENGTH)){
            System.out.println("Player " +getPlayerName() +" With Position "+ this.getPosition() + "  has Won!! ");
            return true;
        }
        return false;
    }

    public int rollDice() {

        int diceNumber = 0;
        do{
            diceNumber += dice.roll();
            if(diceNumber == NO_MOVEMENT_IF_TOTAL_OF_DICE_BECOMES_THRESHOLD){
                System.out.println("Player Playing -->" + getPlayerName() + " hits maximum number " + " No Change In Position As Dice Number Will Now Be 0");
                return 0;
            }
        }while(diceNumber% CHANCE_ALLOWED == 0);

        return diceNumber;
    }
}
