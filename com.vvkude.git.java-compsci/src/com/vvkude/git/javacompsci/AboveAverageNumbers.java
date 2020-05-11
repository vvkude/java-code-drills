package com.vvkude.git.javacompsci;
import java.util.Scanner;

/*
 * Problem: Read a bunch of numbers, get the average of those numbers, find and display   
 * the number of numbers greater than the average
 * 
 * Solution: Prompt the user to enter an array size and create an array of that size
 * Add each number to a `sum` variable, obtain the average by dividing by the array length
 * compare each number in the array with the average to enumerate the values above the average
 */

public class AboveAverageNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the number of items. This is the size of the array
		System.out.print("Enter the number of items you want to analyze: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		// Calculate the sum of the user's input
		System.out.print("Enter the numbers separated by a space: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// Calculate the average of the user's input
		double average = sum / n;
		
		// Compare array elements against the average and increment a count variable
		int count = 0; // The number of items above the average
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;
		
		// Display the results back to the user
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		System.out.println("The number of items above the average is " + count);

	}
}
