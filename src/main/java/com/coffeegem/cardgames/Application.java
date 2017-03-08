package com.coffeegem.cardgames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Deck deck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        List<Card> cards = new ArrayList<>(52);
        for (Suit s : Suit.values()) {
            for (String r : ranks) {
                cards.add(new Card(r, s));
            }
        }
        Deck deck = new Deck(cards);
        deck.shuffle();
        return deck;
    }
}
