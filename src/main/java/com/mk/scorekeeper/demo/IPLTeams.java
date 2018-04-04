package com.mk.scorekeeper.demo;

public enum IPLTeams {

    CSK("Chennai Super Kings"),
    DD("Delhi Daredevils"),
    KXIP("Kings XI Punjab"),
    KKR("Kolkata Knight Riders"),
    MI("Mumbai Indians"),
    RR("Rajasthan Royals"),
    RCB("Royal Challengers Bangalore"),
    SH("Sunrisers Hyderabad");

    IPLTeams(String name){
        this.name = name;
    }
    private String name;
    public String getName(){
        return name;
    }
}
