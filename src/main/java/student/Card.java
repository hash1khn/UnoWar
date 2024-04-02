package student;

//Represents a playing card.
public class Card {
    private final int rank;
    private final int suit;

    //Constructor
    public Card(int rank, int suit) {
        if (rank < 1 || rank > 13 || suit < 1 || suit > 4) {
            System.out.println("Invalid rank or suit. Setting to Ace of Spades.");
            this.rank = 1; // Ace
            this.suit = 1; // Spades
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }


     //Returns the numeric rank of the card.
    public int getRankNum() {
        return rank;
    }

    //Returns the name of the rank of the card
    public String getRankName() {
        switch (rank) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return Integer.toString(rank);
        }
    }

    //Returns the name of the suit of the card.
    public String getSuitName() {
        switch (suit) {
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Clubs";
            case 4:
                return "Diamonds";
            default:
                return "Unknown";
        }
    }
     //Returns a string representation of the card.
    @Override
    public String toString() {
        return getRankName() + " of " + getSuitName();
    }

    /*
     Checks if this card is equal to another object.
     Two cards are considered equal if they have the same rank and suit.
     returns true if the cards are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card otherCard = (Card) obj;
        return this.rank == otherCard.rank && this.suit == otherCard.suit;
    }
}
