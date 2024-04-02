package student;

/*
 The UnoWarMatch class represents a single match of the UnoWar game between two AIs.
 It contains methods to play a single game and compute win rates over multiple trials.
 */
public class UnoWarMatch {
    private final AI ai1;
    private final AI ai2;

    //Constructor
    public UnoWarMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    /*
     Plays a single game of UnoWar between the two AIs
     return true if AI 1 wins, false if AI 2 wins.
     */
    public boolean playGame() {
        // Initialize deck and hands
        Deck deck = new Deck();
        Hand hand1 = new Hand(deck, 5);
        Hand hand2 = new Hand(deck, 5);
        int score1 = 0;
        int score2 = 0;

        // Play rounds until one of the AIs wins 10 rounds
        while (score1 < 10 && score2 < 10) {
            CardPile cardPile = new CardPile(deck.draw());
            AI currentPlayer = (score1 == 0 && score2 == 0) ? ai1 : (score1 > score2) ? ai2 : ai1;

            // Play the round
            while (true) {
                Card cardToPlay = currentPlayer.getPlay(currentPlayer == ai1 ? hand1 : hand2, cardPile);
                if (cardToPlay == null) {
                    // AI cannot play any card, switch player and end the round
                    if (currentPlayer == ai1) {
                        score2++;
                    } else {
                        score1++;
                    }
                    break;
                }

                if (cardPile.canPlay(cardToPlay)) {
                    cardPile.play(cardToPlay);
                    if (currentPlayer == ai1) {
                        hand1.remove(cardToPlay);
                    } else {
                        hand2.remove(cardToPlay);
                    }
                } else {
                    // Invalid card played, switch player and end the round
                    if (currentPlayer == ai1) {
                        score2++;
                    } else {
                        score1++;
                    }
                    break;
                }

                // Switch player for next turn
                currentPlayer = (currentPlayer == ai1) ? ai2 : ai1;
            }
        }
        // Determine the winner of the game
        return score1 >= 10;
    }

    /* Computes the win rate of AI 1 over a specified number of trials.
     return The win rate of AI 1.
     */
    public double winRate(int nTrials) {
        int wins1 = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                wins1++;
            }
        }
        return (double) wins1 / nTrials;
    }
}
