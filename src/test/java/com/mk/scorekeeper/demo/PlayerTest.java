package com.mk.scorekeeper.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * A Player plays from a team in a match.
 * He has a name. In Cricket, he can Bat, Bowl or Field.
 * Keeping is a special type of fielding
 * A Captain is a player who takes decisions for the team.
 */
public class PlayerTest {
    @Test
    public void shouldStoreName(){
        Player player = new Player();
        String virat_kohli = "Virat Kohli";
        player.setName(virat_kohli);
        Assert.assertEquals(virat_kohli, player.getName());
    }
    @Test
    public void shouldPlayARole(){
        Player player = new Player();
        String virat_kohli = "Virat Kohli";
        player.setName(virat_kohli);
        PlayerRole role = new PlayerRole() {
            @Override
            public void play() {
                System.out.println("do nothing");
            }
        };
        player.setRole(role);
        Assert.assertEquals(role, player.getRole());
    }
}
