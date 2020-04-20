public class ListPrimeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50; // List this number of primes
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // List this number of primes per line
		int count = 0; // Sentinel variable used to count the primes in the while loop
		int number = 2; // Number to test for primality. Iniatialized at 2, the first prime number

		System.out.println("The first " + NUMBER_OF_PRIMES + " prime numbers are \n");

		// Find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true; // Test if the current number is prime. Prevent default falseyness

			// Test for primality
			for (int divisor = 2; divisor <= number / 2 && isPrime; divisor++) {
				// If number mod divisor is 0, number is not prime
				if (number % divisor == 0) {
					// Set isPrime to false when number mod divisor has a remainder
					isPrime = false;
				}
			}

			// Display the prime number
			if (isPrime) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the prime number and advance to the new line
					System.out.println(number);
				}
				else
					// If we haven't reached the _PER_LINE maximum, display the prime number in-line
					System.out.print(number + " ");
			}

			// Iterate to the next number to check for primality
			number++;
		}
	}
}