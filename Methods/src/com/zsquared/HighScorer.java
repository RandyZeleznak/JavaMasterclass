package com.zsquared;

public class HighScorer {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		
		
		int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);

	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " is in position "
				+ highScorePosition + " on High Score Listing");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		int position = 4;
		if(playerScore >= 1000) {
			position =1;
		} else if(playerScore >= 500) {
			position= 2;
		} else if(playerScore >= 100) {
			position= 3;
		} 
			return position;
	}

	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	
	
	
}
