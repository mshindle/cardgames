package com.coffeegem.cardgames.equipment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mike on 3/7/17.
 */
public class DeckFactory {
    public static Deck createStandardDeck() {
        SingleDeck deck = new SingleDeck();
        deck.addCards(createStandardCards());
        return deck;
    }

    public static Deck createShoe(int n) {
        Shoe shoe = new Shoe(n);
        for (int i = 0; i < n; i++) {
            shoe.addCards(createStandardCards());
        }
        return shoe;
    }

    private static List<Card> createStandardCards() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        List<Card> cards = new ArrayList<>(52);
        for (Card.Suit s : Card.Suit.values()) {
            for (String r : ranks) {
                cards.add(new Card(r, s));
            }
        }
        return cards;
    }
}
