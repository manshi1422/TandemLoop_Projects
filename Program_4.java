import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store count of multiples for numbers 1 through 9
        Map<Integer, Integer> countMultiples = new HashMap<>();

        // Initialize map with 0 counts
        for (int i = 1; i <= 9; i++) {
            countMultiples.put(i, 0);
        }

        // Count how many numbers are divisible by each 1..9
        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num % i == 0) {
                    countMultiples.put(i, countMultiples.get(i) + 1);
                }
            }
        }

        // Output the result
        System.out.println("Output:");
        System.out.println(countMultiples);
    }
}
