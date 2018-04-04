package com.mk.scorekeeper.demo;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players;
    private String name;
    public Team(String name){
        this.name = name;
    }
    public List<Player> getPlayers() {
        if(players==null){
            players = new ArrayList<>();
        }
        return players;
    }

    public void addPlayer(Player player) {
        getPlayers().add(player);
    }

    public String getName() {
        return name;
    }
}
