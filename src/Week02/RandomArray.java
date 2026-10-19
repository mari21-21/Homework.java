package Week02;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        // first we print the random numbers in our array
        System.out.println("Random Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 101);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // defining the min and max
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        // defining the odd and even
        int evenCount = 0;
        int oddCount = 0;

        // looping through the numbers to find the min and max
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
            sum = sum + numbers[i];

            // finding the odd and even nr
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        double average = sum / numbers.length;

        // printing the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

    }
}