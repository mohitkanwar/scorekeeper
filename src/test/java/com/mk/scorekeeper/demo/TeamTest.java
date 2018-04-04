package com.mk.scorekeeper.demo;

import org.junit.Assert;
import org.junit.Test;

public class TeamTest {
    /**
     * A team consists of players, and participates in a series
     */

    @Test
    public void shouldStoreAPlayer(){
        Team team = new Team("Royal Challengers Bangalore");
        Player player = new Player();
        team.addPlayer(player);
        Assert.assertTrue(team.getPlayers().contains(player));
    }
    @Test
    public void shouldStoreAName(){

        String teamName = "Delhi Daredevils";
        Team team = new Team(teamName);
        Assert.assertEquals(teamName,team.getName());
    }
}
