package Alletec_Coding_round_questions;

import java.util.Arrays;
import java.util.Scanner;

public class find_2nd_highest_number {
    public static int answer(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return 0; // If the array is invalid, return 0
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int highest = arr[arr.length - 1]; // The largest number in the array

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < highest) { // Find the first distinct number smaller than 'highest'
                return arr[i];
            }
        }
        return 0; // If no second highest number exists, return 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Input size of the array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Input array elements
        }

        int result = answer(arr); // Call the function
        System.out.println(result); // Print the result
    }
}
