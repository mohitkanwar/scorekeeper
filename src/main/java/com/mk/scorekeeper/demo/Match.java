package com.mk.scorekeeper.demo;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private final Team a;
    private final Team b;
    public  Match(final Team team, final Team team1) {
        a=team;
        b=team1;
    }

    public List<Team> getTeams() {
        List<Team> teams = new ArrayList<>(2);
        teams.add(a);
        teams.add(b);
        return teams;
    }
}
