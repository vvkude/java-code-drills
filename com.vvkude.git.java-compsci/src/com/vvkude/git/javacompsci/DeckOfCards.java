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
				"10", "Jacks", "Queens", "Kings"};
		
		// TODO Assign values to all the cards in the deck
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		// TODO Randomly shuffle the deck of cards
		
		// TODO Display the first four cards to the user
		
		// TODO Remove this testing stub
		for (int i = 0; i < deck.length; i++) 
			System.out.print(deck[i]);

	}

}
