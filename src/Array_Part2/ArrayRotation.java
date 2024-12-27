package Array_Part2;

import java.util.Arrays;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int n = arr.length;
        k %= n; // Handle cases where k > n 

        reverse(arr, 0, n - 1);       // Step 1: Reverse the entire array
        reverse(arr, 0, k - 1);      // Step 2: Reverse the first k elements
        reverse(arr, k, n - 1);      // Step 3: Reverse the remaining elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}

