package com.euhg;

public class Main {

    public static void main(String[] args) {
        //main is a method

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(" Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition(" Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(" Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(" Gilbert", highScorePosition);
    }

// Create a method called displayHighScorePosition
    // it should display a players name as a parameter, and a 2nd parameter as a position in the high score table
    // you should display the players name along with a message like "managed to get into position" and the position
    // they got and a further message "on the high score table"
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is > 1000
    // 2 if the score is > 500 and < 1000
    // 3 if the score is > 100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50


    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table ");
    }

    public static int calculateHighScorePosition (int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        }else if (playerScore >= 500) {
//            return 2;
//        }else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;   //assuming position 4 will be returned

        if (playerScore >= 1000) {
         position = 1;
        } else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }


    // You cannot put a method inside a method... need to be outside
    // need to use public static void when you define a new method
    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}

