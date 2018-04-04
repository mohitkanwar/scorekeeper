package com.mk.scorekeeper.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * A match occurs between two teams
 * A match consists of two innings
 * In each innings One team bowls and the other bats, teams are switched in next innings
 * To decide who bats first, a toss of coin takes place
 * A match consists of score board
 */
public class MatchTest {
    @Test
    public void shouldAddTwoTeams(){
        Team team = new Team("Delhi Daredevils");
        Team team1 = new Team("Rajasthan Royals");
        Match match = new Match(team,team1);
        match.getTeams();
        Assert.assertTrue(match.getTeams().contains(team));
        Assert.assertTrue(match.getTeams().contains(team1));
    }
    @Test
    public void shouldStoreBeginTime(){
        Team team = new Team("Delhi Daredevils");
        Team team1 = new Team("Rajasthan Royals");
        Match match = new Match(team,team1);
        Date matchDate = new Date();
        match.setScheduledDate(matchDate);
        Assert.assertEquals(matchDate,match.getScheduledDate());
    }
}
