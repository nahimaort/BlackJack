package acceptancetests;

import blackjack.BlackJack;
import blackjack.cards.AceCard;
import blackjack.cards.FaceCard;
import blackjack.cards.PipCard;
import blackjack.elements.Deck;
import blackjack.players.Croupier;
import blackjack.players.Player;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTests {
    @Test
    public void case1() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new FaceCard());
        player1.addCard(new AceCard());
        
        Player player2 = new Player();
        player2.addCard(new PipCard(10));
        player2.addCard(new PipCard(5));
        player2.addCard(new PipCard(6));
        
        Player player3 = new Player();
        player3.addCard(new PipCard(3));
        player3.addCard(new PipCard(6));
        player3.addCard(new AceCard());
        player3.addCard(new PipCard(3));
        player3.addCard(new AceCard());
        player3.addCard(new FaceCard());
        
        Croupier croupier = new Croupier();
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(7));
        
        Deck deck = new Deck();
        deck.addCard(new PipCard(5));
        deck.addCard(new PipCard(4));
        deck.addCard(new FaceCard());
        deck.addCard(new PipCard(2));
        
        ArrayList<String> winners = new ArrayList<>();
        winners.add("Player 1");
        assertEquals(winners, BlackJack.getWinners(player1.getPlayerCards(), player2.getPlayerCards(),
                                                   player3.getPlayerCards(), croupier.getCroupierCards(),
                                                   deck.getDeckCards()));
    }
    
    @Test
    public void case2() throws PipCard.IncorrectValueException {
        Player player1 = new Player();
        player1.addCard(new PipCard(10));
        player1.addCard(new FaceCard());
        
        Player player2 = new Player();
        player2.addCard(new PipCard(10));
        player2.addCard(new PipCard(2));
        player2.addCard(new PipCard(6));
        
        Player player3 = new Player();
        player3.addCard(new PipCard(8));
        player3.addCard(new PipCard(8));
        player3.addCard(new PipCard(5));
        
        Croupier croupier = new Croupier();
        croupier.addCard(new PipCard(5));
        croupier.addCard(new PipCard(10));
        
        Deck deck = new Deck();
        deck.addCard(new AceCard());
        deck.addCard(new PipCard(3));
        deck.addCard(new FaceCard());
        deck.addCard(new PipCard(2));
        
        ArrayList<String> winners = new ArrayList<>();
        winners.add("Player 1");
        winners.add("Player 3");
        assertEquals(winners, BlackJack.getWinners(player1.getPlayerCards(), player2.getPlayerCards(),
                                                   player3.getPlayerCards(), croupier.getCroupierCards(),
                                                   deck.getDeckCards()));
    }
    
}
