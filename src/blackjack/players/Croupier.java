package blackjack.players;

import blackjack.cards.Card;
import java.util.ArrayList;

public class Croupier {
    ArrayList<Card> croupierCards = new ArrayList<>();

    public void addCard(Card card) {
        croupierCards.add(card);
    }

    public ArrayList<Card> getCroupierCards() {
        return croupierCards;
    }
}
