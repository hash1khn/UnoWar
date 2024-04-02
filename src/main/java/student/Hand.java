package student;

 //Represents a player's hand containing cards.
public class Hand {
    private final Card[] cards;
    private final Deck deck;
    private int size;
    //Constructor
    public Hand(Deck deck, int size) {
        this.deck = deck;
        this.size = size;
        cards = new Card[size];
        fillHand();
    }
     //Fills the hand with cards drawn from the deck.
    private void fillHand() {
        for (int i = 0; i < size; i++) {
            cards[i] = deck.draw();
        }
    }
     //Returns the size of the hand.
    public int getSize() {
        return size;
    }

    /*
     Gets the card at the specified index in the hand.
     returns The card at the specified index.*/
    public Card get(int i) {
        if (i < 0 || i >= size) {
            System.out.println("Index out of bounds. Returning the first card.");
            return cards[0];
        }
        return cards[i];
    }

    /*
     Removes the specified card from the hand and replaces it with a new card from the deck.
     returns true if the card was successfully removed, false otherwise.*/
    public boolean remove(Card card) {
        for (int i = 0; i < size; i++) {
            if (cards[i] != null && cards[i].equals(card)) {
                cards[i] = deck.draw();
                return true;
            }
        }
        return false;
    }
}
