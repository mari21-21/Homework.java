package Week01;

import java.util.Random;

public class DiceGame {
     static void main(String[] args) {
        Random rand = new Random();

        // user first
        int userRoll1 = rand.nextInt(6) + 1;
        int userRoll2 = rand.nextInt(6) + 1;
        int userTotal = userRoll1 + userRoll2;
        System.out.println("User rolled " + userRoll1 + " and " + userRoll2 + " (Total: " + userTotal + ")");

        // comp next
        int compRoll1 = rand.nextInt(6) + 1;
        int compRoll2 = rand.nextInt(6) + 1;
        int compTotal = compRoll1 + compRoll2;
        System.out.println("Computer rolled " + compRoll1 + " and " + compRoll2 + " (Total: " + compTotal + ")");



        // checking who won
        if (userTotal > compTotal) {
            System.out.println("User is the Winner");
        } else if (compTotal > userTotal) {
            System.out.println("Computer is the Winner");
        } else {
            System.out.println("It is a draw");
        }
    }
}
