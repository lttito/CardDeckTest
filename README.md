## Getting Started

This is a set of classes that represent a deck of poker-style playing cards.
(Fifty-two playing cards in four suits: hearts, spades, clubs, diamonds, with face values of Ace,
2-10, Jack, Queen, and King.)

The main class is Deck class that implements two interfaces: IShuffle and IDeal

Interface IShuffle has a method,  shuffle(), which
returns no value, but results in the cards in the deck being randomly
permuted.

Interface IDeal has a method, dealOneCard, which
return one card from the deck to the caller.
If the caller makes more than 52 calls to dealOneCard(), no
card is dealt.

It uses Maven, so it follows its folder structure.
Package is com.card.deck
