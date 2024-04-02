package student;

/*
 The SmallestCardAI class represents an AI that always plays the smallest-ranked valid card in its hand.
 It overrides the getPlay method of the AI class.
 */
public class SmallestCardAI extends AI {

    /* Returns the smallest-ranked valid card in the hand.
    If no valid card is found, returns null.*/
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card smallestCard = null;
        for (int i = 0; i < hand.getSize(); i++) {
            Card card = hand.get(i);
            if (cardPile.canPlay(card)) {
                if (smallestCard == null || card.getRankNum() < smallestCard.getRankNum()) {
                    smallestCard = card;
                }
            }
        }
        return smallestCard;
    }

    //Returns the name of the AI ("Smallest Card AI").
    @Override
    public String toString() {
        return "Smallest Card AI";
    }
}
