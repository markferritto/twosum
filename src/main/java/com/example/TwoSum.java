package com.example;

import java.util.List;
import java.util.ArrayList;

public class TwoSum {

    /**
     * Returns the indices of two numbers such that their sum is equal to the
     * specified target.
     * 
     * @param numbers the input numbers
     * @param target  the target sum
     * @return a list containing the indices of two numbers, or [-1, -1] if no two
     *         numbers sum up to the target
     */
    public static List<Integer> findTwoSum(int[] numbers, int target) {
        List<Integer> result = new ArrayList<>();
        // Initialize left and right pointers
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Check if the sum of the two numbers is equal to the target
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result.add(left + 1); // Adding 1 to make it 1-indexed
                result.add(right + 1);
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no pair is found, return [-1, -1]
        result.add(-1);
        result.add(-1);
        return result;
    }

    /**
     * Main method to test the TwoSum class.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(findTwoSum(numbers, target)); // Output: [1, 2]
    }
}
