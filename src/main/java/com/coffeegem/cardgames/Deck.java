package com.coffeegem.cardgames;

import java.util.Collections;
import java.util.List;

/**
 * Created by mike on 3/6/17.
 */
public class Deck {
    /**
     * A list of cards. A standard deck is 52 cards.
     */
    private List<Card> cards;

    /**
     * Keeps track of the number of cards that have been dealt from
     * the deck so far.
     */
    private int cardsUsed;

    public Deck(List<Card> cards) {
        this.cards = cards;
        cardsUsed = 0;
    }

    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
        cardsUsed = 0;
    }


    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases.  This function returns the number of cards that
     * are still left in the deck.  The return value would be
     * 52 or 54 (depending on whether the deck includes Jokers)
     * when the deck is first created or after the deck has been
     * shuffled.  It decreases by 1 each time the dealCard() method
     * is called.
     */
    public int cardsLeft() {
        return cards.size() - cardsUsed;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the cardsLeft() function.
     *
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card dealCard() {
        if (cardsUsed == cards.size())
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return cards.get(cardsUsed - 1);
        // Programming note:  Cards are not literally removed from the array
        // that represents the deck.  We just keep track of how many cards
        // have been used.
    }
}
