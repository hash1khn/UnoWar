package student;

import java.util.Random;

//The AI class represents a basic AI player in the UnoWar card game.
public class AI {

    /*
     Picks a card from the hand to play on the card pile.
     returns The card chosen to play, or null if no valid card is found.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            Card card = hand.get(i);
            if (cardPile.canPlay(card)) {
                return card;
            }
        }
        return null;
    }

     //Returns the name of the AI.
    @Override
    public String toString() {
        return "Random Card AI";
    }
}
