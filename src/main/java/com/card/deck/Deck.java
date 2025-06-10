package com.card.deck;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Deck class represents a standard deck of cards.
 * It implements the IShuffle and IDeal interfaces to provide functionality
 * for shuffling the deck and dealing cards.
 * The deck is initialized with 52 cards, and it can be shuffled and dealt from.
 */
public class Deck implements IShuffle, IDeal {
    private List<Card> undealtCards;
    private List<Card> dealtCards;

    /**
     * Constructor for the Deck class.
     * Initializes the deck with 52 cards, each represented by a Card object.
     * The deck is created with all cards undealt.
     */
    public Deck() {
        initializeDeck();
    }

    /**
     * Returns the list of dealt cards.
     * This method provides access to the cards that have been dealt from the deck.
     * It can be used to check which cards have already been dealt.
     *
     * @return a list of dealt cards
     */
    public List<Card> getDealtCards() {
        return dealtCards;
    }

    /**
     * Returns the list of undealt cards.
     * This method provides access to the undealt cards in the deck.
     * It can be used to check which cards are still available to be dealt.
     *
     * @return a list of undealt cards
     */
    public List<Card> getUndealtCards() {
        return undealtCards;
    }

    /**
     * Shuffles the deck of cards.
     * This method randomizes the order of the undealt cards in the deck.
     * It uses the Fisher-Yates shuffle algorithm to ensure a fair shuffle.
     */
    public void shuffle() {
        initializeDeck(); // Reset the deck before shuffling
        Random rand = new Random();
        for (int i = undealtCards.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = undealtCards.get(i);
            undealtCards.set(i, undealtCards.get(j));
            undealtCards.set(j, temp);
        }
    }

    /**
     * Deals one card from the undealt cards.
     * This method returns one card from the deck to the caller. Specifically, a
     * call to shuffle followed by 52 calls to dealOneCard() result in the caller being provided all
     * 52 cards of the deck in a random order. If the caller then makes a 53rd call dealOneCard(), no
     * card is dealt.
     * This method returns null if there are no cards left to deal, because all cards have been dealt.
     *
     * @return the card dealt, or null if no cards are left to deal
     */
    public Card dealOneCard() {
        if (!undealtCards.isEmpty()) {
            // Deal the top card from the undealt cards
            Card dealingCard = undealtCards.remove(0);
            // and move it to the dealt cards
            dealtCards.add(dealingCard);
            return dealingCard;
        } else {
            // No cards left to deal
            return null;
        }
    }

    /**
     * Prints the dealt cards from the deck.
     * This method returns a string representation of all dealt cards in the deck.
     * Each card is represented by its string format, which includes its rank and suit.
     *
     * @return a string containing all dealt cards
     */
    public String printDealtCards() {
        StringBuilder sb = new StringBuilder();
        for (Card card : dealtCards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Prints the undealt cards in the deck.
     * This method returns a string representation of all undealt cards in the deck.
     * Each card is represented by its string format, which includes its rank and suit.
     *
     * @return a string containing all undealt cards
     */
    public String printUndealtCards() {
        StringBuilder sb = new StringBuilder();
        for (Card card : undealtCards) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }

    public String toString() {
        return "Deck status: " +
                "Undealt cards: " + printUndealtCards() +
                " \n " +
                "Dealt cards: " + printDealtCards();
    }

    /**
     * Initializes the deck with all 52 cards.
     * This method creates a new list of undealt cards, populating it with
     * all combinations of suits and ranks.
     */
    private void initializeDeck() {
        undealtCards = new LinkedList<>();
        dealtCards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                undealtCards.add(new Card(suit, rank));
            }
        }
    }
}
