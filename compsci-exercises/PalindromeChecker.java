import java.util.Scanner;

/* 
Assignment: Create an algorithm that checks if a word is a palindrome, or not
Approach: Check if the first and last characters in the input string are the same, then check 
the second to first and second to last. Continue checking all characters or, if the string is
an odd number of characters long, when we reach the middle

*/

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		// Prompt the audience to enter a string
		System.out.print("Enter a word and I'll check if it's a palindrome: ");
		String word = input.nextLine();

		// The index of the first character in the string
		int lowEnd = 0;

		// The index of the last character in the string
		int highEnd = word.length() - 1;

		// Quick sanity check. Output what I have, so far, before continuing with boolean logic
		System.out.println(word + "'s first character is" + lowEnd);
		System.out.println(word + "'s last character is" + highEnd);
	}
}