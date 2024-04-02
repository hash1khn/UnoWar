package student;

import java.util.Arrays;
import java.util.Random;

/*
  The Deck class represents a deck of cards.
  It contains methods for creating, shuffling, and drawing cards from the deck.
 */
public class Deck {
    private final Card[] cards;
    private int cardsRemaining;
    //Constructor
    public Deck() {
        cards = new Card[52];
        int index = 0;
        // Populate the deck with cards of all suits and ranks
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }
        shuffle();
    }
     //Shuffles the deck using the Durstenfeld-Fisher-Yates algorithm.
    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            // Swap cards[i] and cards[j]
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        cardsRemaining = 52;
    }

    /*
     Draws a card from the deck.
     If the deck is empty, it shuffles the deck and then draws a card.
     returns The drawn card.
     */
    public Card draw() {
        if (cardsRemaining == 0) {
            shuffle();
        }
        return cards[--cardsRemaining];
    }
    //Returns the number of cards remaining in the deck.
    public int cardsRemaining() {
        return cardsRemaining;
    }

    /*
     Checks if the deck is empty.
     returns True if the deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cardsRemaining == 0;
    }
}
