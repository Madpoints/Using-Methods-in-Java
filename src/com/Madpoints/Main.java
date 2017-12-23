package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 300;
        int levelCompleted = 5;
        int bonus = 30;
        String playerName = "Nels";

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScoreRank(playerName, highScoreRank(highScore));

        score = 600;
        levelCompleted = 8;
        bonus = 50;
        playerName = "Mad";

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScoreRank(playerName, highScoreRank(highScore));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 100;
            return finalScore;
        }

        return -1;

    }

    public static int highScoreRank(int highScore) {
        if (highScore > 1000) {
            return 1;
        } else if (highScore > 500 && highScore <=  1000) {
            return 2;
        } else if (highScore > 100 && highScore <=  500) {
            return 3;
        } else{
            return 4;
        }
    }

    public static void displayHighScoreRank(String name, int rank) {
        System.out.println("Player: " + name + " Rank: " + rank);
    }
}