package com.company;
import java.util.ArrayList;

public class Territory {


    private String name;
    private int bonusArmy;
    private ArrayList<Region> regions;

    public Territory(String name, int bonusArmy, ArrayList<Region> list) {
        this.name = name;
        this.bonusArmy = bonusArmy;
        regions = list;

        System.out.println("Created territory: " + name + "\nBonus army: " + bonusArmy);
    }

    public String getName() {
        return name;
    }

    /**
     *  Returns the number of bonus armies a player gets per round when the player controls this
     * continent
     **/
    public int getBonusArmy() {
        return bonusArmy;
    }

    /**
     * Retuens a list of the country objects that are on this continent
     **/
    public ArrayList<Region> getRegions() {

        return regions;
    }
}


