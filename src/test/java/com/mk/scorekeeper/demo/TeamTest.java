package com.mk.scorekeeper.demo;

import org.junit.Assert;
import org.junit.Test;

public class TeamTest {
    /**
     * A team consists of players, and participates in a series
     */

    @Test
    public void shouldStoreAPlayer(){
        Team team = new Team();
        Player player = new Player();
        team.addPlayer(player);
        Assert.assertTrue(team.getPlayers().contains(player));
    }
}
