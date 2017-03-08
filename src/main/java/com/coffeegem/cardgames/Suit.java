package com.coffeegem.cardgames;

/**
 * Created by mike on 3/6/17.
 */
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
