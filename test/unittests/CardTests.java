package unittests;

import blackjack.cards.AceCard;
import blackjack.cards.Card;
import blackjack.cards.FaceCard;
import blackjack.cards.PipCard;
import static org.junit.Assert.*;
import org.junit.Test;

public class CardTests {
    @Test
    public void FaceCardValuesTest() {
        Card faceCard = new FaceCard();
        assertEquals(10, faceCard.getValue());
    }
    
    @Test
    public void AceCardValuesTest() {
        Card ace = new AceCard();
        assertEquals(11, ace.getValue());
    }
    
    @Test
    public void PipCardValuesTest() throws PipCard.IncorrectValueException {
        for (int i = 2; i <= 10; i++) {
            Card pipCard = new PipCard(i);
            assertEquals(i, pipCard.getValue());
        }
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void PipCardWithValuesUnder0Test() throws PipCard.IncorrectValueException {
        for (int i = -10; i <= 0; i++) {
            PipCard pipCard = new PipCard(i);
        }
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void PipCardWithValuesAbove10Test() throws PipCard.IncorrectValueException {
        for (int i = 11; i <= 20; i++) {
            PipCard pipCard = new PipCard(i);
        }
    }
    
    @Test(expected = PipCard.IncorrectValueException.class)
    public void PipCardWithValue1Test() throws PipCard.IncorrectValueException {
        PipCard pipCard = new PipCard(1);
    }
}
