package com.kannanrameshrk.cricketscorecard.dto;

import java.util.Random;

public class Bowler extends Player {
	int runsGiven;
    int wicketsTaken;
    int oversBowled;

    public Bowler(String name) {
        super(name);
        this.runsGiven = 0;
        this.wicketsTaken = 0;
        this.oversBowled = 0;
    }

    // Method to simulate a bowler's bowling
    public void bowl(Random random) {
        int runs = random.nextInt(7); // Generates a random number between 0 and 6
        this.runsGiven += runs;
        if (runs == 0 && random.nextDouble() < 0.1) { // 10% chance of getting a wicket on a dot ball
            this.wicketsTaken++;
        }
        this.oversBowled++;
    }

    public String getBowlerStats() {
        return name + " - " + runsGiven + " runs, " + wicketsTaken + " wickets, " + oversBowled + " overs";
    }
}
