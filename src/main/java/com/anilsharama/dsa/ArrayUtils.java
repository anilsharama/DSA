package com.anilsharama.dsa;

/**
 * A collection of array utility methods for Data Structures and Algorithms
 */
public class ArrayUtils {
    
    /**
     * Find the maximum element in an array
     * @param arr the input array
     * @return the maximum element
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Find the minimum element in an array
     * @param arr the input array
     * @return the minimum element
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Reverse an array in place
     * @param arr the input array to reverse
     */
    public static void reverse(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
