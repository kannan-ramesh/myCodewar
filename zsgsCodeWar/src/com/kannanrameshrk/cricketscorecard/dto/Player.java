package com.kannanrameshrk.cricketscorecard.dto;

import java.util.Random;

public class Player {
	 public String name;
	    public int runsScored;
	    int ballsFaced;
	    public boolean isOut;

	    public Player(String name) {
	        this.name = name;
	        this.runsScored = 0;
	        this.ballsFaced = 0;
	        this.isOut = false;
	    }

	    // Method to simulate a player's batting
	    public void bat(Random random) {
	        int run = random.nextInt(7); // Generates a random number between 0 and 6
	        this.runsScored += run;
	        this.ballsFaced++;

	        // Chance of getting out
	        if (this.ballsFaced >= 10) { // Assuming a player gets out after facing 10 balls
	            this.isOut = true;
	        }
	    }

}
