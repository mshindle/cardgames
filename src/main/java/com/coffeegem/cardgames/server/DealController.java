package com.coffeegem.cardgames.server;

import com.coffeegem.cardgames.Deal;
import com.coffeegem.cardgames.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by mike on 3/6/17.
 */
@Controller
public class DealController {
    private Deck deck;
    private long actionId;

    @Autowired
    public DealController(Deck deck) {
        this.deck = deck;
        this.actionId = 0;
    }

    @MessageMapping("/deal")
    @SendTo("/topic/deal")
    public Deal deal(String name) {
        actionId++;
        return new Deal(actionId,name,deck.dealCard());
    }
}
