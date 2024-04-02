package student;

 //Represents a tournament between different AIs in the UnoWar game.
public class Tournament {
    public static void main(String[] args) {
        AI randomAI = new AI();
        SmallestCardAI smallestCardAI = new SmallestCardAI();
        BiggestCardAI biggestCardAI = new BiggestCardAI();

        UnoWarMatch match1 = new UnoWarMatch(randomAI, randomAI);
        UnoWarMatch match2 = new UnoWarMatch(randomAI, smallestCardAI);
        UnoWarMatch match3 = new UnoWarMatch(randomAI, biggestCardAI);
        UnoWarMatch match4 = new UnoWarMatch(smallestCardAI, randomAI);
        UnoWarMatch match5 = new UnoWarMatch(smallestCardAI, smallestCardAI);
        UnoWarMatch match6 = new UnoWarMatch(smallestCardAI, biggestCardAI);
        UnoWarMatch match7 = new UnoWarMatch(biggestCardAI, randomAI);
        UnoWarMatch match8 = new UnoWarMatch(biggestCardAI, smallestCardAI);
        UnoWarMatch match9 = new UnoWarMatch(biggestCardAI, biggestCardAI);

        // Print win rates of each match
        System.out.println("Random Card AI vs. Random Card AI winRate: " + match1.winRate(1000));
        System.out.println("Random Card AI vs. Smallest Card AI winRate: " + match2.winRate(1000));
        System.out.println("Random Card AI vs. Biggest Card AI winRate: " + match3.winRate(1000));
        System.out.println("Smallest Card AI vs. Random Card AI winRate: " + match4.winRate(1000));
        System.out.println("Smallest Card AI vs. Smallest Card AI winRate: " + match5.winRate(1000));
        System.out.println("Smallest Card AI vs. Biggest Card AI winRate: " + match6.winRate(1000));
        System.out.println("Biggest Card AI vs. Random Card AI winRate: " + match7.winRate(1000));
        System.out.println("Biggest Card AI vs. Smallest Card AI winRate: " + match8.winRate(1000));
        System.out.println("Biggest Card AI vs. Biggest Card AI winRate: " + match9.winRate(1000));
    }
}
