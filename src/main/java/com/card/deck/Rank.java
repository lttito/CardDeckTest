package com.card.deck;

/**
 * Enum representing the ranks of a standard deck of playing cards.
 * Each rank has a name and a symbol for display purposes.
 */
public enum Rank {
    ACE("Ace", "A"),
    TWO("Two", "2"),
    THREE("Three", "3"),
    FOUR("Four", "4"),
    FIVE("Five", "5"),
    SIX("Six", "6"),
    SEVEN("Seven", "7"),
    EIGHT("Eight", "8"),
    NINE("Nine", "9"),
    TEN("Ten", "10"),
    JACK("Jack", "J"),
    QUEEN("Queen", "Q"),
    KING("King", "K");

    private final String name;
    private final String symbol;

    /**
     * Constructs a Rank with the specified name and symbol.
     *
     * @param name   the name of the rank
     * @param symbol the symbol of the rank
     */
    Rank(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Gets the name of the rank.
     *
     * @return the name of the rank
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the symbol of the rank.
     *
     * @return the symbol of the rank
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Returns a string representation of the rank.
     *
     * @return a string representing the rank's symbol
     */
    public String toString() {
        return getSymbol();
    }
}
