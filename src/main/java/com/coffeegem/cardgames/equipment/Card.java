package com.coffeegem.cardgames.equipment;

/**
 * Created by mike on 3/6/17.
 */
public class Card {
    private String rank;
    private Suit suit;

    public Card(String rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return getRank() + getSuit();
    }

    public enum Suit {
        CLUBS("C"),DIAMONDS("D"), HEARTS("H"), SPADES("S");

        private String code;

        Suit(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        @Override
        public String toString() {
            return getCode();
        }

        public static Suit lookupCode(String code) {
            for(Suit v : values())
                if(v.getCode().equalsIgnoreCase(code)) return v;
            throw new IllegalArgumentException();
        }
    }
}
