package com.coffeegem.cardgames.equipment;

/**
 * 
 * Created by mike on 3/7/17.
 */
public class Shoe extends AbstractDeck {
    /**
     * Number of decks that make up shoe. Should be 2, 4, 6, or 8.
     */
    private int numDecks;

    public Shoe(int numDecks) {
        super();
        this.numDecks = numDecks;
    }

    @Override
    public boolean shouldReshuffle() {
        return false;
    }
}
