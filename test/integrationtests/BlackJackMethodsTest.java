package integrationtests;

import blackjack.BlackJack;
import blackjack.cards.AceCard;
import blackjack.cards.FaceCard;
import blackjack.cards.PipCard;
import blackjack.players.Player;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlackJackMethodsTest {
    
    @Test
    public void getPointsWithOnlyPipCards() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new PipCard(5));
        player1.addCard(new PipCard(7));
        player1.addCard(new PipCard(8));
        assertEquals(20, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWithOnlyFaceCardsTest() {
        Player player1 = new Player();
        player1.addCard(new FaceCard());
        player1.addCard(new FaceCard());
        assertEquals(20, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWithOnlyAceCardTest() {
        Player player1 = new Player();
        player1.addCard(new AceCard());
        assertEquals(11, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith1FaceCardAnd1AceTest() {
        Player player1 = new Player();
        player1.addCard(new AceCard());
        player1.addCard(new FaceCard());
        assertEquals(21, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith1FaceCardAnd2PipsTest() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new FaceCard());
        player1.addCard(new PipCard(6));
        player1.addCard(new PipCard(2));
        assertEquals(18, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith1AceAnd1PipTest() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new PipCard(7));
        player1.addCard(new AceCard());
        assertEquals(18, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith2FaceCardsAnd1AceTest() {
        Player player1 = new Player();
        player1.addCard(new AceCard());
        player1.addCard(new FaceCard());
        player1.addCard(new FaceCard());
        assertEquals(21, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith1AceAnd2PipsTest() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new PipCard(7));
        player1.addCard(new PipCard(5));
        player1.addCard(new AceCard());
        assertEquals(13, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith2AcesAnd1FaceCardTest() {
        Player player1 = new Player();
        player1.addCard(new AceCard());
        player1.addCard(new AceCard());
        player1.addCard(new FaceCard());
        assertEquals(12, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
    
    @Test
    public void getPointsWith2Aces() {
        Player player1 = new Player();
        player1.addCard(new AceCard());
        player1.addCard(new AceCard());
        assertEquals(12, BlackJack.getHandPoints(player1.getPlayerCards()));
    }
}
