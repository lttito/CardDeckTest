package com.card.deck;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RankTest {
    // This class will contain tests for the Rank enum
    // It will include methods to test rank properties and behaviors

    @Test
    public void testRankProperties() {
        // Test the name of each rank
        assertEquals("Ace", Rank.ACE.getName(), "ACE should have name Ace");
        assertEquals("Two", Rank.TWO.getName(), "TWO should have name Two");
        assertEquals("Three", Rank.THREE.getName(), "THREE should have name Three");
        assertEquals("Four", Rank.FOUR.getName(), "FOUR should have name Four");
        assertEquals("Five", Rank.FIVE.getName(), "FIVE should have name Five");
        assertEquals("Six", Rank.SIX.getName(), "SIX should have name Six");
        assertEquals("Seven", Rank.SEVEN.getName(), "SEVEN should have name Seven");
        assertEquals("Eight", Rank.EIGHT.getName(), "EIGHT should have name Eight");
        assertEquals("Nine", Rank.NINE.getName(), "NINE should have name Nine");
        assertEquals("Ten", Rank.TEN.getName(), "TEN should have name Ten");
        assertEquals("Jack", Rank.JACK.getName(), "JACK should have name Jack");
        assertEquals("Queen", Rank.QUEEN.getName(), "QUEEN should have name Queen");
        assertEquals("King", Rank.KING.getName(), "KING should have name King");

        // Test the symbol of each rank
        assertEquals("A", Rank.ACE.getSymbol(), "ACE should have symbol A");
        assertEquals("2", Rank.TWO.getSymbol(), "TWO should have symbol 2");
        assertEquals("3", Rank.THREE.getSymbol(), "THREE should have symbol 3");
        assertEquals("4", Rank.FOUR.getSymbol(), "FOUR should have symbol 4");
        assertEquals("5", Rank.FIVE.getSymbol(), "FIVE should have symbol 5");
        assertEquals("6", Rank.SIX.getSymbol(), "SIX should have symbol 6");
        assertEquals("7", Rank.SEVEN.getSymbol(), "SEVEN should have symbol 7");
        assertEquals("8", Rank.EIGHT.getSymbol(), "EIGHT should have symbol 8");
        assertEquals("9", Rank.NINE.getSymbol(), "NINE should have symbol 9");
        assertEquals("10", Rank.TEN.getSymbol(), "TEN should have symbol 10");
        assertEquals("J", Rank.JACK.getSymbol(), "JACK should have symbol J");
        assertEquals("Q", Rank.QUEEN.getSymbol(), "QUEEN should have symbol Q");
        assertEquals("K", Rank.KING.getSymbol(), "KING should have symbol K");

        // Test the string representation of each rank
        assertEquals("A", Rank.ACE.toString(), "ACE should be represented as A");
        assertEquals("2", Rank.TWO.toString(), "TWO should be represented as 2");
        assertEquals("3", Rank.THREE.toString(), "THREE should be represented as 3");
        assertEquals("4", Rank.FOUR.toString(), "FOUR should be represented as 4");
        assertEquals("5", Rank.FIVE.toString(), "FIVE should be represented as 5");
        assertEquals("6", Rank.SIX.toString(), "SIX should be represented as 6");
        assertEquals("7", Rank.SEVEN.toString(), "SEVEN should be represented as 7");
        assertEquals("8", Rank.EIGHT.toString(), "EIGHT should be represented as 8");
        assertEquals("9", Rank.NINE.toString(), "NINE should be represented as 9");
        assertEquals("10", Rank.TEN.toString(), "TEN should be represented as 10");
        assertEquals("J", Rank.JACK.toString(), "JACK should be represented as J");
        assertEquals("Q", Rank.QUEEN.toString(), "QUEEN should be represented as Q");
        assertEquals("K", Rank.KING.toString(), "KING should be represented as K");
    }
}
