package blackjack.cards;

public class AceCard implements Card {

    @Override
    public int getValue() {
        return 11;
    }
    
    @Override
    public String toString() {
        return "Ace Card with value " + this.getValue();
    }
}
