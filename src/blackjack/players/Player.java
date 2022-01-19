package blackjack.players;

import blackjack.cards.Card;
import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playerCards = new ArrayList<Card>();
    
    public void addCard(Card card) {
        playerCards.add(card);
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }
}
