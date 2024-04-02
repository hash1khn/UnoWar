import student.*;
/**
 * This class has some basic tests for the Deck class. */
public class CardPileTest {
    public static void main(String[] args) {
        Card c1 = new Card(1, 1);
        Card c2 = new Card(2, 1);
        Card c3 = new Card(1, 2);
        Card c4 = new Card(2, 2);
        CardPile pile = new CardPile(c1);
        System.out.println(pile.getNumCards());// should print 1
        System.out.println(pile.getTopCard()); // should print "Ace of Spades";
        System.out.println(pile.canPlay(c2));//should print true
        System.out.println(pile.canPlay(c3));
        System.out.println(pile.canPlay(c4));

        pile.play(c2);
        System.out.println(pile.getNumCards());
        System.out.println(pile.getTopCard());
        System.out.println(pile.canPlay(c1));
        System.out.println(pile.canPlay(c3));
        System.out.println(pile.canPlay(c4));

        pile.play(c4);
        System.out.println(pile.getNumCards());
        System.out.println(pile.getTopCard());
        System.out.println(pile.canPlay(c1));
        System.out.println(pile.canPlay(c2));
        System.out.println(pile.canPlay(c3));
        pile.play(c1);//should print illegal move
        System.out.println(pile.getNumCards());
        System.out.println(pile.getTopCard());

        pile.play(null);//should print illegal move
        System.out.println(pile.getNumCards());//should print 3
        System.out.println(pile.getTopCard());//Should print "Two Of hearts";
    }
}