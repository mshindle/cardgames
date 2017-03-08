package com.coffeegem.cardgames;

import com.coffeegem.cardgames.equipment.Card;
import com.coffeegem.cardgames.equipment.Deck;
import com.coffeegem.cardgames.equipment.DeckFactory;
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
        Deck deck = DeckFactory.createShoe(6);
        deck.shuffle();
        return deck;
    }
}
