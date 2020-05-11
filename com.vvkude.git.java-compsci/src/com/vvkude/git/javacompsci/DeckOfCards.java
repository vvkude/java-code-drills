package com.vvkude.git.javacompsci;

/*
 * Problem: Write a program that will randomly draw 4 cards from a standard deck of cards
 * 
 * Solution: Store the cards in an array along with suits and ranks
 * Integer division should yield the suit
 * Modulo operator should yield the rank
 */

public class DeckOfCards {

	public static void main(String[] args) {
		// Create arrays for the deck, suits and ranks
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
				"10", "Jack", "Queen", "King"};
		
		// Assign values to all the cards in the deck
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		
		// Display 4 random cards to the user
		for (int i = 0; i < 4; i++) {
			int cardNumber = (int)(Math.random() * deck.length);
			String suit = suits[cardNumber / 13];
			String rank = ranks[cardNumber % 13];
			System.out.println("Card number " + deck[i] + ": "
					+ rank + " of " + suit);
		}

	}

}
