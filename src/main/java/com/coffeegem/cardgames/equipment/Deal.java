package com.coffeegem.cardgames.equipment;

/**
 * Created by mike on 3/6/17.
 */
public class Deal {
    private Long actionId;
    private String player;
    private Card card;

    public Deal(Long actionId, String player, Card card) {
        this.actionId = actionId;
        this.player = player;
        this.card = card;
    }

    public Long getActionId() {
        return actionId;
    }

    public String getPlayer() {
        return player;
    }

    public Card getCard() {
        return card;
    }
}
