package com.card.deck;

/**
 * Enum representing the suits of a standard deck of playing cards.
 * Each suit has a name and a symbol for display purposes.
 */
public enum Suit {
    SPADES("Spades", "♠"),
    HEARTS("Hearts", "♥"),
    DIAMONDS("Diamonds", "♦"),
    CLUBS("Clubs", "♣");

    private final String name;
    private final String symbol;

    /**
     * Constructs a Suit with the specified name and symbol.
     *
     * @param name   the name of the suit
     * @param symbol the symbol of the suit
     */
    Suit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Gets the name of the suit.
     *
     * @return the name of the suit
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the symbol of the suit.
     *
     * @return the symbol of the suit
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Returns a string representation of the suit.
     *
     * @return a string representing the suit's symbol
     */
    public String toString() {
        return getSymbol();
    }
}
