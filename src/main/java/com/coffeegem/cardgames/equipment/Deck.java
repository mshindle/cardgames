package com.coffeegem.cardgames.equipment;

/**
 * Created by mike on 3/6/17.
 */
public interface Deck {
    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    void shuffle();

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the cardsLeft() function.
     *
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    Card dealCard();

    /**
     * As cards are dealt from the deck, the number of cards left
     * decreases.  This function returns the number of cards that
     * are still left in the deck.  It decreases by 1 each time
     * the dealCard() method is called.
     */
    int cardsLeft();

    /**
     * Indicate to the dealer whether the deck should be reshuffled. Mainly used
     * in multi-deck shoes to denote when the penetration mark has been passed.
     *
     * @return true when the deck indicates cards should be reshuffled before another round
     */
    boolean shouldReshuffle();
}
