package org.example;

import java.util.Arrays;

public class App {

    public int maximumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be empty");

        return Arrays.stream(nums)
                     .max()
                     .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public int minimumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be empty");

        return Arrays.stream(nums)
                     .min()
                     .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public int sumUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be empty");

        return Arrays.stream(nums).sum();
    }

    public double averageUsingStream(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be empty");

        return Arrays.stream(nums)
                     .average()
                     .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Welcome to my Just An Average Day Project!");

        // Example array
        int[] nums = {3, 1, 7, 5, 9};
        
        System.out.println("Maximum using Stream API: " + app.maximumUsingStream(nums));
        System.out.println("Minimum using Stream API: " + app.minimumUsingStream(nums));
        System.out.println("Sum using Stream API: " + app.sumUsingStream(nums));
        System.out.println("Average using Stream API: " + app.averageUsingStream(nums));
    }
}
