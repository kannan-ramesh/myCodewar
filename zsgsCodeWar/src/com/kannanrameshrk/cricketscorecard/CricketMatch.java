package com.kannanrameshrk.cricketscorecard;

import java.util.Random;

import com.kannanrameshrk.cricketscorecard.dto.Bowler;
import com.kannanrameshrk.cricketscorecard.dto.Player;

public class CricketMatch {
	 Player[] punjab = {
		        new Player("Smith"),
		        new Player("Dhawan"),
		        new Player("Agarwal"),
		        new Bowler("Patel"),
		        new Bowler("Singh")
		    };

		    Player[] chennai = {
		        new Player("Dhoni"),
		        new Player("Conway"),
		        new Player("Rayudu"),
		        new Bowler("Bravo"),
		        new Bowler("Jadeja")
		    };

		    Random random = new Random();
		    int target = 0; // Target set by the first innings

		    // Simulate an innings for a batting team
		    int simulateInnings(Player[] battingTeam, Player[] bowlingTeam) {
		        int totalRuns = 0;
		        int wickets = 0;
		        int ballsBowled = 0;

		        for (Player player : battingTeam) {
		            while (!player.isOut && ballsBowled < 30 && wickets < 2 && totalRuns < target + 1) { // 5 overs, 2 wickets, and check if target achieved
		                if (player instanceof Bowler) {
		                    ((Bowler) player).bowl(random);
		                } else {
		                    player.bat(random);
		                }
		                ballsBowled++;

		                // Chance of getting out
		                if (player.isOut) {
		                    wickets++;
		                }
		            }
		            totalRuns += player.runsScored;
		        }

		        return totalRuns;
		    }

		    // Method to simulate the match
		    void playMatch() {
		    	 int team1Score = simulateInnings(punjab, chennai);
		    	    target = team1Score + 1; // Set the target for the second innings
		    	    int team2Score = simulateInnings(chennai, punjab);

		    	    System.out.println("Punjab");
		    	    System.out.println("-------------");
		    	    for (Player player : punjab) {
		    	        System.out.println(player.name + ": " + player.runsScored + " runs");
		    	    }

		    	    System.out.println();
		    	    System.out.println("Chennai");
		    	    System.out.println("-------------");
		    	    for (Player player : chennai) {
		    	        System.out.println(player.name + ": " + player.runsScored + " runs");
		    	    }

		    	    System.out.println();
		    	    System.out.println("------------------------------------------");
		    	    System.out.println("Punjab Score: " + team1Score);
		    	    System.out.println("Chennai Score: " + team2Score);

		    	    if (team2Score >= target) {
		    	        System.out.println("Chennai wins!");
		    	    } else {
		    	        System.out.println("Punjab wins!");
		    	    }

		    	    // Display bowler statistics
		    	    System.out.println();
		    	    System.out.println("Bowler Statistics:");
		    	    System.out.println("Punjab");
		    	    System.out.println("-------------");
		    	    for (Player player : punjab) {
		    	        if (player instanceof Bowler) {
		    	            Bowler bowler = (Bowler) player;
		    	            System.out.println(bowler.getBowlerStats());
		    	        }
		    	    }

		    	    System.out.println();
		    	    System.out.println("Chennai");
		    	    System.out.println("-------------");
		    	    for (Player player : chennai) {
		    	        if (player instanceof Bowler) {
		    	            Bowler bowler = (Bowler) player;
		    	            System.out.println(bowler.getBowlerStats());
		    	        }
		    	    }
		    }
}
