package com.andrew.soccerleagueteams.model;

public class CountryItem {
    private String countryName;
    private int countryFlag;

    public CountryItem(String countryName, int countryFlag) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }
}
