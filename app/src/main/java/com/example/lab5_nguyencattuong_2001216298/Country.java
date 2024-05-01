package com.example.lab5_nguyencattuong_2001216298;

import androidx.annotation.NonNull;

public class Country {
    private String countryName;
    private String flagName;
    private int population;

    public String getCountryName() {
        return countryName;
    }

    public String getFlagName() {
        return flagName;
    }

    public int getPopulation() {
        return population;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country(String countryName, String flagName, int population) {
        this.countryName = countryName;
        this.flagName = flagName;
        this.population = population;
    }


    @Override
    public String toString() {
        return this.countryName + "(Population:" + this.population + ")";
    }
}
