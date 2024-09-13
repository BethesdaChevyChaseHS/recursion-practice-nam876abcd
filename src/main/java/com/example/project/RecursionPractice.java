package com.example.project;

public class RecursionPractice {

	public static void main(final String[] args) {
		//use main to test your functions!
	}
	
	//factorial of n should return the long n multiplied by all numbers before it. 
	//if n == 0 or n == 1, 1 should be returned.
	//note that a long is just an int with twice the memory
	public static long factorial(long n){
		return 0;
	}

	//sum of n should return the long n added  by all numbers before it. 
	//if n == 0, 0 should be returned.
	//this is essentially factorial but with addition
	public static long sum(long n){
		return 0;
	}
	
	// The fibonacci of n should return the long value at position n in the Fibonacci sequence.
	// If n == 0, 0 should be returned.
	// If n == 1, 1 should be returned.
	// For n > 1, it should return the sum of fibonacci(n - 1) and fibonacci(n - 2).
	public static long fibonacci(long n){
		return 0;
	}

	//Should return the index of the first W/w in a string. 
	//If there is no w, return -1. 
	// Use recursion!The point of this exercise is to show that anything you can do with a loop, 
	//you can do with recursion
	//This is a problem that can be easily solved without recursion, but I want you to practice
	//using recursion to solve problems. 

	//hint with base cases - 
	//1)  the character at the current index is W
	//2) The current index is out of bounds
	public static int findTheFirstW(String s, int curIndex){
		return -1;
	}
}

