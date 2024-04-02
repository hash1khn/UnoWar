package student;

//Represents a pile of cards in the game.
public class CardPile {
    private Card topCard;
    private int numCards;

     //Constructor
    public CardPile(Card topCard) {
        this.topCard = topCard;
        numCards = 1;
    }

    /*
     Checks if the provided card can be played on top of the pile.
     A card can be played if its rank is equal to or higher than the top card's rank,
     or if its suit matches the top card's suit.
     */
    public boolean canPlay(Card card) {
        if (card == null) {
            return false;
        }
        return card.getRankNum() >= topCard.getRankNum() || card.getSuitName().equals(topCard.getSuitName());
    }

    //Plays the provided card on top of the pile if it can be played.
    public void play(Card card) {
        if (canPlay(card)) {
            topCard = card;
            numCards++;
        } else {
            System.out.println("Illegal Move");
        }
    }

    //Returns the number of cards in the pile.
    public int getNumCards() {
        return numCards;
    }

    //Returns the top card of the pile.
    public Card getTopCard() {
        return topCard;
    }
}
