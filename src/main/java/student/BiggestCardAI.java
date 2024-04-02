package student;

/*The BiggestCardAI class represents an AI that always plays the biggest-ranked valid card in its hand.
 It overrides the getPlay method of the AI class.
 */
public class BiggestCardAI extends AI {
     //Returns the biggest-ranked valid card in the hand.
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card biggestCard = null;
        for (int i = 0; i < hand.getSize(); i++) {
            Card card = hand.get(i);
            if (cardPile.canPlay(card)) {
                if (biggestCard == null || card.getRankNum() > biggestCard.getRankNum()) {
                    biggestCard = card;
                }
            }
        }
        return biggestCard;
    }
     //Returns the name of the AI ("Biggest Card AI").
    @Override
    public String toString() {
        return "Biggest Card AI";
    }
}
