package blackjack.cards;

public class FaceCard implements Card {

    @Override
    public int getValue() {
        return 10;
    }
    
    @Override
    public String toString() {
        return "Face Card with value " + this.getValue();
    }
}
