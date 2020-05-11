package com.vvkude.git.javacompsci;

public class RandomArrayShuffle {

	public static void main(String[] args) {
		double[] myArray = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		// Display the initial array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i] + " ");
		}
		
		double temp = myArray[0]; // to hold the first array element
		
		// Move all array elements to the left by one
		for (int i = 1; i < myArray.length; i++) {
			myArray[i - 1] = myArray[i];
		}
		
		// Move the array's first element to the end of the array
		myArray[myArray.length - 1] = temp;
		
		// Display the new array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i] + " ");
		}

	}

}
