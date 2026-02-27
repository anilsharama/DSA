package com.anilsharama.dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ArrayUtils
 */
class ArrayUtilsTest {
    
    @Test
    void testFindMaxWithPositiveNumbers() {
        int[] arr = {1, 5, 3, 9, 2};
        assertEquals(9, ArrayUtils.findMax(arr));
    }
    
    @Test
    void testFindMaxWithNegativeNumbers() {
        int[] arr = {-5, -2, -10, -1};
        assertEquals(-1, ArrayUtils.findMax(arr));
    }
    
    @Test
    void testFindMaxWithSingleElement() {
        int[] arr = {42};
        assertEquals(42, ArrayUtils.findMax(arr));
    }
    
    @Test
    void testFindMaxWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMax(null);
        });
    }
    
    @Test
    void testFindMaxWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMax(new int[0]);
        });
    }
    
    @Test
    void testFindMinWithPositiveNumbers() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(1, ArrayUtils.findMin(arr));
    }
    
    @Test
    void testFindMinWithNegativeNumbers() {
        int[] arr = {-5, -2, -10, -1};
        assertEquals(-10, ArrayUtils.findMin(arr));
    }
    
    @Test
    void testFindMinWithSingleElement() {
        int[] arr = {42};
        assertEquals(42, ArrayUtils.findMin(arr));
    }
    
    @Test
    void testFindMinWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMin(null);
        });
    }
    
    @Test
    void testFindMinWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findMin(new int[0]);
        });
    }
    
    @Test
    void testReverseWithMultipleElements() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr);
    }
    
    @Test
    void testReverseWithTwoElements() {
        int[] arr = {1, 2};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new int[]{2, 1}, arr);
    }
    
    @Test
    void testReverseWithSingleElement() {
        int[] arr = {42};
        ArrayUtils.reverse(arr);
        assertArrayEquals(new int[]{42}, arr);
    }
    
    @Test
    void testReverseWithEmptyArray() {
        int[] arr = new int[0];
        ArrayUtils.reverse(arr);
        assertArrayEquals(new int[0], arr);
    }
    
    @Test
    void testReverseWithNullArray() {
        assertDoesNotThrow(() -> {
            ArrayUtils.reverse(null);
        });
    }
}
