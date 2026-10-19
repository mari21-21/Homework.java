package Week01;

import java.util.Random;

public class RandomDice {
    static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(0, 6) ;
        System.out.println("You rolled the number " + a);
    }
}