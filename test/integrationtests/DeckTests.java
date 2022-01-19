package integrationtests;

import blackjack.cards.AceCard;
import blackjack.cards.Card;
import blackjack.cards.FaceCard;
import blackjack.cards.PipCard;
import blackjack.elements.Deck;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DeckTests {
    
    @Test
    public void deckWithOnlyPipCards() throws PipCard.IncorrectValueException {
        Deck deck = new Deck();
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            deck.addCard(new PipCard(i));
            cards.add(new PipCard(i));
        }
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test
    public void deckWithOnlyFaceCardsTest() {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Deck deck = new Deck();
        deck.addCard(jack);
        deck.addCard(king);
        deck.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test
    public void deckWithOnlyAceCardTest() {
        Card ace = new AceCard();
        Deck deck = new Deck();
        deck.addCard(ace);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test
    public void deckWithAceAndPipCardTest() throws PipCard.IncorrectValueException {
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue6 = new PipCard(6);
        Card pipWithValue8 = new PipCard(8);
        Deck deck = new Deck();
        deck.addCard(ace);
        deck.addCard(pipWithValue2);
        deck.addCard(pipWithValue6);
        deck.addCard(pipWithValue8);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(pipWithValue2);
        cards.add(pipWithValue6);
        cards.add(pipWithValue8);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test
    public void deckWithAceAndFaceCardTest() {
        Card ace = new AceCard();
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Deck deck = new Deck();
        deck.addCard(ace);
        deck.addCard(jack);
        deck.addCard(king);
        deck.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test
    public void deckWithFaceCardAndPipCardTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Deck deck = new Deck();
        deck.addCard(jack);
        deck.addCard(king);
        deck.addCard(queen);
        deck.addCard(pipWithValue2);
        deck.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void deckWithWrongPipValuesTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue1 = new PipCard(1);
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Deck deck = new Deck();
        deck.addCard(jack);
        deck.addCard(king);
        deck.addCard(queen);
        deck.addCard(pipWithValue1);
        deck.addCard(pipWithValue2);
        deck.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
    }
    
    @Test
    public void deckWithPipFaceAndAceCards() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Deck deck = new Deck();
        deck.addCard(ace);
        deck.addCard(jack);
        deck.addCard(king);
        deck.addCard(queen);
        deck.addCard(pipWithValue2);
        deck.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), deck.getDeckCards().toString());
    }
}
