package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {

    String name;
    public int order;
    public ArrayList<Player> territories ;
    public ArrayList<Player> army ;



    public Player(String nom) {

        this.name = name ;
        this.order = order;
        this.territories = territories;
        this.army = army;



    }

    public static void Attack(){

    }

    public static void Movement(){

    }

    public String getName() {
        return name;
    }


    /** public int getArmy() {
        return army;
    }
**/

     public void minusArmy(int number) {

        army = army - number;
        System.out.println(name + " has " + army + " reinforcements remaining.");
    }

    /**
     * Increases the count of the number of numArmies the player has on the board
     * This count has to reflect the actual number of numArmies the players has on
     * the board
     **/
    public void plusArmy(int number) {

        army = army + number;
        System.out.println(name + " has gained " + number + " reinforcements. Total available: " + army);
    }

    /**
     * When a player conquers a country the country needs to be added to a data structure
     * that keeps track of all countries the player occupies
     **/
    public void addRegion(Territory region) {

        System.out.println(name + " now occupies " + Region.getName() + "!");
        countriesHeld.put(Region.getName(), region);
    }

    /**
     * Works like addCountry above, but can be used to add multiple countries at once
     **/
    public void addRegion(ArrayList<Region> listRegion) {

        for(int i = 0; i < listRegion.size(); i++) {

            countriesHeld.put(listRegion.get(i).getName(), listRegion.get(i));
        }
    }

    /**
     * When a player loses a country, the country must be removed from the data structure
     * tracking which countries the player occupies
     **/
    public void removeCountry(String countryName) {

        System.out.println(name + " no longer occupies " + countryName + "!");
        countriesHeld.remove(countryName);
    }

    /**
     * When a player occupies all the countries on a continent the continent must be added to
     * a data structure that tracks which continents the player occupies
     **/
    public void addContinent(Continent continent) {

        System.out.println(name + " now controls " + continent.getName() + ", granting them " + continent.getBonusArmies() + " per turn!");
        continentsHeld.put(continent.getName(), continent);
    }

    /**
     * Removes a contient from the data structure to reflect that the player no longer controls
     * the whole continent
     **/
    public void removeContinent(String continentName) {

        continentsHeld.remove(continentName);
    }


    public ArrayList<Country> getOwnedCountries() {

        return new ArrayList<Country>(countriesHeld.values());
    }


}
