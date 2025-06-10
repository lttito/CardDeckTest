package com.card.deck;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {
    // This class will contain tests for the Deck class
    // It will include methods to test deck creation, shuffling, and dealing cards
    
    // Example test method
    @Test
    public void testDeckCreation() {
        // Create a new deck and check if it contains 52 cards
        // This method will create a new Deck instance and verify that it contains 52 cards
        Deck deck = new Deck();
        // Assert that the deck is not null and has the correct number of cards
        assertEquals(52, deck.getUndealtCards().size(), "Deck should contain 52 undealt cards");
        assertTrue(deck.getDealtCards().isEmpty(), "Deck should have no dealt cards initially");
    }

    @Test
    public void testShuffle() {
        // Create a deck, shuffle it, and check if the order of cards has changed
        Deck deck = new Deck();
        deck.shuffle();
        // Assert that the deck is still valid after shuffling
        assertEquals(52, deck.getUndealtCards().size(), "Deck should still contain 52 undealt cards after shuffling");
        assertTrue(deck.getDealtCards().isEmpty(), "Deck should have no dealt cards after shuffling");
        // Additional checks to verify that the order of cards has changed
        assertNotEquals(deck.getUndealtCards(), new Deck().getUndealtCards(), "Deck order should change after shuffling");
    }
    
    @Test
    public void testDealOneCard() {
        // Create a deck, deal one card, and check if the dealt card is valid
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        assertEquals(51, deck.getUndealtCards().size(), "Deck should contain 51 undealt cards after dealing one card");
    }

    @Test
    public void testDealAllCards() {
        // Create a deck and deal all cards, then check if the deck is empty
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        for (int i = 0; i < 52; i++) {
            Card dealtCard = deck.dealOneCard();
            assertNotNull(dealtCard, "Dealt card should not be null");
        }
        assertTrue(deck.getUndealtCards().isEmpty(), "Deck should have no undealt cards after dealing all cards");
        assertEquals(52, deck.getDealtCards().size(), "Deck should have 52 dealt cards after dealing all cards");
        // Check that a 53rd call to dealOneCard returns null
        Card extraCard = deck.dealOneCard();
        assertNull(extraCard, "Dealing a card from an empty deck should return null");
    }

    @Test
    public void testDealtCards() {
        // Create a deck, deal one card, and check if the dealt card is in the dealt cards list
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        assertTrue(deck.getDealtCards().contains(dealtCard), "Dealt card should be in the dealt cards list");
        assertEquals(1, deck.getDealtCards().size(), "Deck should have one dealt card after dealing one card");
    }

    @Test
    public void testUnshuffledDealtCards() {
        // Create a new deck and deal one card without shuffling
        Deck deck = new Deck();
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        // Check that the dealt card is in the dealt cards list
        assertTrue(deck.getDealtCards().contains(dealtCard), "Dealt card should be in the dealt cards list");
        // Check that the undealt cards list has been reduced by one
        assertEquals(51, deck.getUndealtCards().size(), "Deck should contain 51 undealt cards after dealing one card");
        assertEquals(1, deck.getDealtCards().size(), "Deck should have one dealt card after dealing one card");
        // Check that the dealt card is the ace of spades
        Card aceOfSpades = new Card(Suit.SPADES, Rank.ACE);
        assertEquals(aceOfSpades, dealtCard, "Dealt card should be the ace of spades when dealing without shuffling");
    }

    @Test 
    public void testUndealtCards() {
        // Create a new deck and check the undealt cards
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        // Assert that the undealt cards contain all 52 cards
        assertEquals(52, deck.getUndealtCards().size(), "Deck should contain 52 undealt cards initially");
        
        // Deal one card and check the undealt cards again
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        assertEquals(51, deck.getUndealtCards().size(), "Deck should contain 51 undealt cards after dealing one card");
    }

    @Test
    public void testUnshuffledUndealtCards() {
        // Create a new deck and check the undealt cards without shuffling
        Deck deck = new Deck();
        // Assert that the undealt cards contain all 52 cards
        assertEquals(52, deck.getUndealtCards().size(), "Deck should contain 52 undealt cards initially");
        
        // Deal one card and check the undealt cards again
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        assertEquals(51, deck.getUndealtCards().size(), "Deck should contain 51 undealt cards after dealing one card");
    }

    @Test
    public void testPrintDealtCards() {
        // Create a new deck and check the string representation of the dealt cards
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        Card dealtCard = deck.dealOneCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        String deckString = deck.printDealtCards();
        assertNotNull(deckString, "Deck string representation should not be null");
        assertTrue(deckString.contains(dealtCard.toString()), "Deck string representation should contain the dealt card");
    }

    @Test
    public void testPrintUndealtCards() {
        // Create a new deck and check the string representation of the undealt cards
        Deck deck = new Deck();
        deck.shuffle(); // Shuffle the deck before dealing
        String undealtString = deck.printUndealtCards();
        assertNotNull(undealtString, "Undealt cards string representation should not be null");
        assertEquals(52, deck.getUndealtCards().size(), "Deck should contain 52 undealt cards initially");
        // Check that the undealt string contains all undealt cards
        for (Card card : deck.getUndealtCards()) {
            assertTrue(undealtString.contains(card.toString()), "Undealt cards string representation should contain all undealt cards");
        }
    }

    @Test
    public void testDeckToString() {
        // Create a new deck and check the string representation of the deck
        Deck deck = new Deck();
        String deckString = deck.toString();
        assertNotNull(deckString, "Deck string representation should not be null");
        assertTrue(deckString.contains("Deck status:"), "Deck string representation should contain Deck status section");
        assertTrue(deckString.contains("Undealt cards:"), "Deck string representation should contain undealt cards section");
        assertTrue(deckString.contains("Dealt cards:"), "Deck string representation should contain dealt cards section");
        assertEquals(52, deck.getUndealtCards().size(), "Deck should contain 52 undealt cards initially");
        assertTrue(deck.getDealtCards().isEmpty(), "Deck should have no dealt cards initially");
    }
}
