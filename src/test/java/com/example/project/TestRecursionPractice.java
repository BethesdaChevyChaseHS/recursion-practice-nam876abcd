package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestRecursionPractice {

    // Factorial Tests
    @Test
    @DisplayName("Factorial of 0 should be 1")
    public void testFactorial0() {
        assertEquals(1, RecursionPractice.factorial(0));
    }

    @Test
    @DisplayName("Factorial of 1 should be 1")
    public void testFactorial1() {
        assertEquals(1, RecursionPractice.factorial(1));
    }

    @Test
    @DisplayName("Factorial of 2 should be 2")
    public void testFactorial2() {
        assertEquals(2, RecursionPractice.factorial(2));
    }

    @Test
    @DisplayName("Factorial of 3 should be 6")
    public void testFactorial3() {
        assertEquals(6, RecursionPractice.factorial(3));
    }

    @Test
    @DisplayName("Factorial of 4 should be 24")
    public void testFactorial4() {
        assertEquals(24, RecursionPractice.factorial(4));
    }

    // Sum Tests
    @Test
    @DisplayName("Sum of 0 should be 0")
    public void testSum0() {
        assertEquals(0, RecursionPractice.sum(0));
    }

    @Test
    @DisplayName("Sum of 1 should be 1")
    public void testSum1() {
        assertEquals(1, RecursionPractice.sum(1));
    }

    @Test
    @DisplayName("Sum of 2 should be 3")
    public void testSum2() {
        assertEquals(3, RecursionPractice.sum(2));
    }

    @Test
    @DisplayName("Sum of 3 should be 6")
    public void testSum3() {
        assertEquals(6, RecursionPractice.sum(3));
    }

    @Test
    @DisplayName("Sum of 4 should be 10")
    public void testSum4() {
        assertEquals(10, RecursionPractice.sum(4));
    }

    // Fibonacci Tests
    @Test
    @DisplayName("Fibonacci of 0 should be 0")
    public void testFibonacci0() {
        assertEquals(0, RecursionPractice.fibonacci(0));
    }

    @Test
    @DisplayName("Fibonacci of 1 should be 1")
    public void testFibonacci1() {
        assertEquals(1, RecursionPractice.fibonacci(1));
    }

    @Test
    @DisplayName("Fibonacci of 2 should be 1")
    public void testFibonacci2() {
        assertEquals(1, RecursionPractice.fibonacci(2));
    }

    @Test
    @DisplayName("Fibonacci of 3 should be 2")
    public void testFibonacci3() {
        assertEquals(2, RecursionPractice.fibonacci(3));
    }

    @Test
    @DisplayName("Fibonacci of 4 should be 3")
    public void testFibonacci4() {
        assertEquals(3, RecursionPractice.fibonacci(4));
    }

    @Test
    @DisplayName("Fibonacci of 5 should be 5")
    public void testFibonacci5() {
        assertEquals(5, RecursionPractice.fibonacci(5));
    }

    // findTheFirstW Tests
    @Test
    @DisplayName("First 'W' in 'Wabc' should be at index 0")
    public void testFindTheFirstW_Start() {
        assertEquals(0, RecursionPractice.findTheFirstW("Wabc", 0));
    }

    @Test
    @DisplayName("First 'W' in 'abcW' should be at index 3")
    public void testFindTheFirstW_End() {
        assertEquals(3, RecursionPractice.findTheFirstW("abcW", 0));
    }

    @Test
    @DisplayName("First 'W' in 'abWc' should be at index 2")
    public void testFindTheFirstW_Middle() {
        assertEquals(2, RecursionPractice.findTheFirstW("abWc", 0));
    }

    @Test
    @DisplayName("First 'w' in 'wxyz' should be at index 0")
    public void testFindTheFirstW_Lowercase() {
        assertEquals(0, RecursionPractice.findTheFirstW("wxyz", 0));
    }

    @Test
    @DisplayName("No 'W' in 'abcd' should return -1")
    public void testFindTheFirstW_None() {
        assertEquals(-1, RecursionPractice.findTheFirstW("abcd", 0));
    }

    @Test
    @DisplayName("Empty string should return -1")
    public void testFindTheFirstW_EmptyString() {
        assertEquals(-1, RecursionPractice.findTheFirstW("", 0));
    }
}
