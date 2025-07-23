package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testMaximumUsingStream() {
        App app = new App();
        int[] nums = {3, 1, 7, 5, 9};
        assertEquals(9, app.maximumUsingStream(nums), "Maximum should be 9");
    }

    @Test
    void testMinimumUsingStream() {
        App app = new App();
        int[] nums = {3, 1, 7, 5, 9};
        assertEquals(1, app.minimumUsingStream(nums), "Minimum should be 1");
    }

    @Test
    void testSumUsingStream() {
        App app = new App();
        int[] nums = {3, 1, 7, 5, 9};
        assertEquals(25, app.sumUsingStream(nums), "Sum should be 25");
    }

    @Test
    void testAverageUsingStream() {
        App app = new App();
        int[] nums = {3, 1, 7, 5, 9};
        assertEquals(5.0, app.averageUsingStream(nums), "Average should be 5.0");
    }

    @Test
    void testEmptyArrayMaximum() {
        App app = new App();
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> app.maximumUsingStream(nums), "Should throw exception for empty array");
    }

    @Test
    void testEmptyArrayMinimum() {
        App app = new App();
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> app.minimumUsingStream(nums), "Should throw exception for empty array");
    }

    @Test
    void testEmptyArraySum() {
        App app = new App();
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> app.sumUsingStream(nums), "Should throw exception for empty array");
    }

    @Test
    void testEmptyArrayAverage() {
        App app = new App();
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> app.averageUsingStream(nums), "Should throw exception for empty array");
    }
}
