package com.card.deck;

/**
 * Represents a playing card with a suit and a rank.
 * Each card is defined by its suit (Hearts, Diamonds, Clubs, Spades)
 * and its rank (Ace, 2-10, Jack, Queen, King).
 */
public class Card {
    private Suit suit;
    private Rank rank;

    /**
     * Constructs a Card with the specified suit and rank.
     *
     * @param suit the suit of the card
     * @param rank the rank of the card
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Gets the suit of the card.
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the rank of the card.
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }
    
    /**
     * Returns a string representation of the card.
     * @return a string representing the card's rank and suit
     */
    public String toString() {
        return rank.toString() + suit.toString();
    }

    /**
     * Returns a long string representation of the card.
     * This includes the full name of the rank and suit.
     * @return a string representing the card's rank and suit in full
     */
    public String getLongString() {
        return rank.getName() + " of " + suit.getName();
    }

    @Override
    /**
     * Checks if this card is equal to another object.
     * @param obj the object to compare with
     * @return true if the object is a Card with the same suit and rank, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }
}
