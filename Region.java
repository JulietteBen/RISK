package com.company;
import java.util.ArrayList;

public class Region {

    private int army;
    private boolean occupied;

    private String name;
    private Player occupant;
    private ArrayList<Region> neighbors;

    public Region(String name) {

        this.name = name;
        occupied = false;
        army = 0;

        System.out.println("Created region: " + name);
    }

    /**
     * Used only when contstructing the country object, it should not be called after
     * the board is initialized
     **/
    public void addNeighbors(ArrayList<Region> neighbors) {

        this.neighbors = neighbors;
    }

    public String getName() {
        return name;
    }

    /**
     * When a player conquers a country the player object is set as the occupant of the
     * country
     **/
    public void setOccupant(Player occupant) {
        occupied = true;
        this.occupant = occupant;
    }

    /**
     * Returns the player object who currently occupies the country
     **/
    public Player getOccupant() {
        return occupant;
    }

    public void setNumArmies(int number) {
        army = number;
    }

    public void addArmy(int number) {
        army = army + number;
        System.out.println(occupant.getName() + " added " + number + " armies to " + name + ".");
    }

    public void removeArmy(int number) {
        army = army - number;
        System.out.println(occupant.getName() + " lost " + number + " armies in " + name + ".");
    }

    /**
     * Returns the number of armies currently stationed in this country
     **/
    public int getArmy() {
        return army;
    }

    /**
     *  Returns a list of the country objects that are adjacent to this country on the board
     **/
    public ArrayList<Region> getNeighbors() {
        return neighbors;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
