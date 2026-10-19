package Week01;

import java.util.Random;

public class DiceTest {
     static void main(String[] args) {
        Random rand = new Random();
        int[] counters = new int[6];

        for (int i = 0; i < 1000; i++) {
            int roll = rand.nextInt(6) + 1;
            counters[roll - 1]++;
        }

        for (int i = 0; i < counters.length; i++) {
            System.out.println((i + 1) + ": " + counters[i] + " times");
        }
    }
}