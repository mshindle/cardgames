package com.coffeegem.cardgames.equipment;

/**
 * Created by mike on 3/7/17.
 */
public class SingleDeck extends AbstractDeck {

    public SingleDeck() {
        super();
    }

    /**
     * Indicate to the dealer whether the deck should be reshuffled.
     *
     * @return false since we never mark penetration in a single deck
     */
    @Override
    public boolean shouldReshuffle() {
        return false;
    }
}
