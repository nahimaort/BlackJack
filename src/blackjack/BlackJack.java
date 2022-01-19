package blackjack;

import blackjack.cards.AceCard;
import blackjack.cards.Card;
import java.util.ArrayList;

public class BlackJack {

    public static ArrayList<String> getWinners(ArrayList<Card> ... parameters) {
        ArrayList<String> winners = new ArrayList<String>();
        ArrayList<Card> croupierCards = parameters[3];
        ArrayList<Card> deckCards = parameters[4];
                              
        if (getHandPoints(croupierCards) < 17) completeCroupierHand(croupierCards, deckCards);
        
        if (getHandPoints(croupierCards) > 21) {
            for (int i = 0; i < 3; i++) {
                if (getHandPoints(parameters[i]) <= 21) winners.add("Player " + (i+1));
            }
        } else if (isBlackJack(croupierCards)) {
            winners.add("Croupier");
            return winners;
        } else {
            for (int i = 0; i < 3; i++) {
                int playerPoints = getHandPoints(parameters[i]);
                int croupierPoints = getHandPoints(croupierCards);
                if ( isBlackJack(parameters[i]) || (playerPoints <= 21 && playerPoints > croupierPoints)) {
                    winners.add("Player " + (i+1));
                }
            }
            if (winners.isEmpty()) winners.add("Croupier");
        }
        return winners;
    }
    
    public static int getHandPoints(ArrayList<Card> playerCards) {
        int points = 0;
        int aceCount = 0;
        for (Card card : playerCards) {
            if (card instanceof AceCard) aceCount++;
            points += card.getValue();
        }
        if (aceCount > 0 && points > 21) {
            while (points > 21) {
                points -= 10;
                aceCount--;
            }
        }
        return points;
    }

    private static void completeCroupierHand(ArrayList<Card> croupierCards, ArrayList<Card> deckCards) {
        while (getHandPoints(croupierCards) < 17) {
            croupierCards.add(deckCards.remove(0));
        }
    }
    
    private static boolean isBlackJack(ArrayList<Card> cards) {
        return (cards.size() == 2 && getHandPoints(cards) == 21);
    }
    
}
