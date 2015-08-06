package com.game.domain;

import com.game.literals.GameLiterals;

import java.util.HashMap;
import java.util.Map;

import static com.game.literals.GameLiterals.POSITION_SETTINGS_IN_GAME;

/**
 * Created by Saurabh on 06-08-2015.
 */
public class GamingBoard {

    Map<Integer,Integer> positionSettingsMap = new HashMap<>();


    private void populatePositionSettingsMap() {
        for (int index = 0; index < POSITION_SETTINGS_IN_GAME.length ; index++ ){
            positionSettingsMap.put(POSITION_SETTINGS_IN_GAME[index][0],POSITION_SETTINGS_IN_GAME[index][1]);
        }
    }

    public Map<Integer, Integer> getPositionSettingsMap() {
        populatePositionSettingsMap();
        return positionSettingsMap;
    }
}
