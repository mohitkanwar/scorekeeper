package com.mk.scorekeeper.demo;

import org.junit.Assert;
import org.junit.Test;

public class SeriesTest {
    /**
     * A Series is a collection of matches which are planned in advance which can occur between two or more teams.
     * At this point, focus on Cricket IPL Series as an example.
     *
     * The series will have Schedule dates and time for matches.
     * After the series is over, a winner is decided. In rare cases there can be joint winners (where two or more teams share the trophy)
     * There will be a player of the series.
     *
     */
    @Test
    public void shouldStoreTeams(){
        Series series = new Series();
        Team team = new Team();
        series.addTeam(team);
        Assert.assertTrue(series.getTeams().contains(team));
    }
    @Test
    public void shouldStoreMatches(){
        Series series = new Series();
        Match match = new Match(new Team(),new Team());
        series.addMatch(match);
        Assert.assertTrue(series.getMatches().contains(match));
    }
    @Test
    public void shouldHaveAName(){
        Series series = new Series();
        String name = "IPL 2018";
        series.setName(name);
        Assert.assertEquals(name,series.getName());
    }


}
