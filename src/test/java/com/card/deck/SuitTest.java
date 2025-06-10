package com.card.deck;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SuitTest {
    // This class will contain tests for the Suit enum
    // It will include methods to test suit properties and behaviors

    @Test
    public void testSuitProperties() {
        // Test the name of each suit
        assertEquals("Hearts", Suit.HEARTS.getName(), "HEARTS should have name Hearts");
        assertEquals("Diamonds", Suit.DIAMONDS.getName(), "DIAMONDS should have name Diamonds");
        assertEquals("Clubs", Suit.CLUBS.getName(), "CLUBS should have name Clubs");
        assertEquals("Spades", Suit.SPADES.getName(), "SPADES should have name Spades");

        // Test the symbol of each suit
        assertEquals("♥", Suit.HEARTS.getSymbol(), "HEARTS should have symbol ♥");
        assertEquals("♦", Suit.DIAMONDS.getSymbol(), "DIAMONDS should have symbol ♦");
        assertEquals("♣", Suit.CLUBS.getSymbol(), "CLUBS should have symbol ♣");
        assertEquals("♠", Suit.SPADES.getSymbol(), "SPADES should have symbol ♠");

        // Test the toString method of each suit
        assertEquals("♥", Suit.HEARTS.toString(), "HEARTS toString should return ♥");
        assertEquals("♦", Suit.DIAMONDS.toString(), "DIAMONDS toString should return ♦");
        assertEquals("♣", Suit.CLUBS.toString(), "CLUBS toString should return ♣");
        assertEquals("♠", Suit.SPADES.toString(), "SPADES toString should return ♠");
    }
}
