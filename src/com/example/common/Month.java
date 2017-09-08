package com.example.common;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String englishName;

    Month(String englishName){
        this.englishName = englishName;
    }

    //getters (why would this need to be static? //
    //THIS IS JUST LINKE A CLASS GETTER... SO WHAT"S THE ISH

    public String getEnglishName() {
        return englishName;
    }

}