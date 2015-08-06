package com.game.domain;

/**
 * Created by Saurabh on 06-08-2015.
 */
public class Dice {

    public int roll() {
        return (int) ((Math.random() * 6) + 1);
    }
}
