package com.mk.scorekeeper.demo;

import org.junit.Test;

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
        Match match = new Match(new Team(),new Team());
        match.getTeams();
    }
}
