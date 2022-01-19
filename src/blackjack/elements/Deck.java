package blackjack.elements;

import blackjack.cards.Card;
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deckCards = new ArrayList<>();

    public void addCard(Card card) {
        deckCards.add(card);
    }

    public ArrayList<Card> getDeckCards() {
        return deckCards;
    }
}
