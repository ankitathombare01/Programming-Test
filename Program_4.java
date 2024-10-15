import java.util.HashMap;

public class Program_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Create a HashMap to store the count of multiples for each number from 1 to 9
        HashMap<Integer, Integer> multiplesCount = new HashMap<>();

        // Initialize the HashMap with the divisors as keys and 0 as their initial count
        for (int divisor : divisors) {
            multiplesCount.put(divisor, 0);
        }

        // Loop through each number in the list and check for multiples
        for (int num : numbers) {
            for (int divisor : divisors) {
                if (num % divisor == 0) {
                    multiplesCount.put(divisor, multiplesCount.get(divisor) + 1);
                }
            }
        }

        // Print the result as {1: count1, 2: count2, ..., 9: count9}
        System.out.println(multiplesCount);
    }
}
