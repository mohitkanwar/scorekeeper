package com.mk.scorekeeper.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Series {
    private Set<Team> teams;
    private List<Match> matches;
    private String name;
    public void addTeam(Team team) {
        getTeams().add(team);
    }
    public void addMatch(Match match) {
        getMatches().add(match);
    }

    public Set<Team> getTeams(){
        if(this.teams==null){
            this.teams = new HashSet<>();
        }
        return this.teams;
    }
    public List<Match> getMatches(){
        if(this.matches==null){
            this.matches = new ArrayList<>();
        }
        return this.matches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
