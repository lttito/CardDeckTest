package com.card.deck;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    public void testCardCreation() {
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertEquals(Suit.HEARTS, card.getSuit(), "Card suit should be HEARTS");
        assertEquals(Rank.ACE, card.getRank(), "Card rank should be ACE");
    }

    @Test
    public void testCardToString() {
        Card card = new Card(Suit.SPADES, Rank.KING);
        assertEquals("K♠", card.toString(), "Card string representation is incorrect");
    }

    @Test
    public void testCardLongString() {
        Card card = new Card(Suit.DIAMONDS, Rank.QUEEN);
        assertEquals("Queen of Diamonds", card.getLongString(), "Card long string representation is incorrect");
    }

    @Test
    public void testDifferentCardsNotEqual() {
        Card card1 = new Card(Suit.CLUBS, Rank.TEN);
        Card card2 = new Card(Suit.CLUBS, Rank.JACK);
        assertNotEquals(card1.getRank(), card2.getRank(), "Ranks should not be equal");
        assertEquals(card1.getSuit(), card2.getSuit(), "Suits should be equal");
    }

    @Test
    public void testAllSuitsAndRanks() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                assertEquals(suit, card.getSuit());
                assertEquals(rank, card.getRank());
            }
        }
    }

    @Test
    public void testToStringFormat() {
        Card card = new Card(Suit.HEARTS, Rank.JACK);
        assertTrue(card.toString().matches("[A2-9JQK10][♠♥♦♣]"), "Card toString format is incorrect");
    }

    @Test
    public void testCardEquality() {
        Card card1 = new Card(Suit.CLUBS, Rank.ACE);
        Card card2 = new Card(Suit.CLUBS, Rank.ACE);
        assertEquals(card1, card2, "Cards with same suit and rank should be equal");
    }

    @Test
    public void testCardInequality() {
        Card card1 = new Card(Suit.HEARTS, Rank.TWO);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TWO);
        Deck deck = new Deck();
        assertNotEquals(card1, card2, "Cards with different suits should not be equal");
        assertNotEquals(card1, deck, "Card should not be equal to a Deck object");
    }
}
