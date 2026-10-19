package Week02;

import java.util.Random;

public class ArrayStats {
    static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        System.out.println("Random array of numbers ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1,100);
            System.out.print(numbers[i] + " ");
        }
    }
}
