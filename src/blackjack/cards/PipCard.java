package blackjack.cards;

public class PipCard implements Card {
    private final int value;

    public PipCard(int value) throws IncorrectValueException {
        if (value < 2 | value > 10) throw new IncorrectValueException();
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return "Pip Card with value " + this.getValue();
    }

    public static class IncorrectValueException extends Exception {

        public IncorrectValueException() {
            super("Wrong value for Pip Card");
        }
    }

    
}
