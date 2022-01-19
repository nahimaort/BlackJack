package integrationtests;

import blackjack.cards.AceCard;
import blackjack.cards.Card;
import blackjack.cards.FaceCard;
import blackjack.cards.PipCard;
import blackjack.players.Croupier;
import blackjack.players.Player;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTests {
    
    @Test
    public void playerWithOnlyPipCardsTest() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            player1.addCard(new PipCard(i));
            cards.add(new PipCard(i));
        }
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test
    public void playerWithOnlyFaceCardsTest() {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Player player1 = new Player();
        player1.addCard(jack);
        player1.addCard(king);
        player1.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(player1.getPlayerCards().toString(), cards.toString());
    }
    
    @Test
    public void playerWithOnlyAceCardTest() {
        Card ace = new AceCard();
        Player player1 = new Player();
        player1.addCard(ace);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test
    public void playerWithAceAndPipCardTest() throws PipCard.IncorrectValueException {
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue6 = new PipCard(6);
        Card pipWithValue8 = new PipCard(8);
        Player player1 = new Player();
        player1.addCard(ace);
        player1.addCard(pipWithValue2);
        player1.addCard(pipWithValue6);
        player1.addCard(pipWithValue8);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(pipWithValue2);
        cards.add(pipWithValue6);
        cards.add(pipWithValue8);
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test
    public void playerWithAceAndFaceCardTest() {
        Card ace = new AceCard();
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Player player1 = new Player();
        player1.addCard(ace);
        player1.addCard(jack);
        player1.addCard(king);
        player1.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test
    public void playerWithFaceCardAndPipCardTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Player player1 = new Player();
        player1.addCard(jack);
        player1.addCard(king);
        player1.addCard(queen);
        player1.addCard(pipWithValue2);
        player1.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void playerWithWrongPipValuesTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue1 = new PipCard(1);
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Player player1 = new Player();
        player1.addCard(jack);
        player1.addCard(king);
        player1.addCard(queen);
        player1.addCard(pipWithValue1);
        player1.addCard(pipWithValue2);
        player1.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
    }
    
    @Test
    public void playerWithPipFaceAndAceCards() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Player player1 = new Player();
        player1.addCard(ace);
        player1.addCard(jack);
        player1.addCard(king);
        player1.addCard(queen);
        player1.addCard(pipWithValue2);
        player1.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), player1.getPlayerCards().toString());
    }
    
    @Test
    public void croupierWithOnlyPipCardsTest() throws PipCard.IncorrectValueException {
        Croupier croupier = new Croupier();
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            croupier.addCard(new PipCard(i));
            cards.add(new PipCard(i));
        }
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test
    public void croupierWithOnlyFaceCardsTest() {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Croupier croupier = new Croupier();
        croupier.addCard(jack);
        croupier.addCard(king);
        croupier.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test
    public void croupierWithOnlyAceCardTest() {
        Card ace = new AceCard();
        Croupier croupier = new Croupier();
        croupier.addCard(ace);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test
    public void croupierWithAceAndPipCardTest() throws PipCard.IncorrectValueException {
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue6 = new PipCard(6);
        Card pipWithValue8 = new PipCard(8);
        Croupier croupier = new Croupier();
        croupier.addCard(ace);
        croupier.addCard(pipWithValue2);
        croupier.addCard(pipWithValue6);
        croupier.addCard(pipWithValue8);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(pipWithValue2);
        cards.add(pipWithValue6);
        cards.add(pipWithValue8);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test
    public void croupierWithAceAndFaceCardTest() {
        Card ace = new AceCard();
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Croupier croupier = new Croupier();
        croupier.addCard(ace);
        croupier.addCard(jack);
        croupier.addCard(king);
        croupier.addCard(queen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test
    public void croupierWithFaceCardAndPipCardTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Croupier croupier = new Croupier();
        croupier.addCard(jack);
        croupier.addCard(king);
        croupier.addCard(queen);
        croupier.addCard(pipWithValue2);
        croupier.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void croupierWithWrongPipValuesTest() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card pipWithValue1 = new PipCard(1);
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Croupier croupier = new Croupier();
        croupier.addCard(jack);
        croupier.addCard(king);
        croupier.addCard(queen);
        croupier.addCard(pipWithValue1);
        croupier.addCard(pipWithValue2);
        croupier.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
    }
    
    @Test
    public void croupierWithPipFaceAndAceCards() throws PipCard.IncorrectValueException {
        Card jack = new FaceCard();
        Card king = new FaceCard();
        Card queen = new FaceCard();
        Card ace = new AceCard();
        Card pipWithValue2 = new PipCard(2);
        Card pipWithValue5 = new PipCard(5);
        Croupier croupier = new Croupier();
        croupier.addCard(ace);
        croupier.addCard(jack);
        croupier.addCard(king);
        croupier.addCard(queen);
        croupier.addCard(pipWithValue2);
        croupier.addCard(pipWithValue5);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(ace);
        cards.add(jack);
        cards.add(king);
        cards.add(queen);
        cards.add(pipWithValue2);
        cards.add(pipWithValue5);
        assertEquals(cards.toString(), croupier.getCroupierCards().toString());
    }
}
