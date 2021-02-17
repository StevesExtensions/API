package gq.stev.stevesextensions.event.player;

import gq.stev.stevesextensions.entity.PlayerEntity;
import gq.stev.stevesextensions.event.Preventable;

public class PlayerChatMessageSendEvent extends PlayerEvent implements Preventable {
    private final String text;
    private boolean prevented = false;

    public PlayerChatMessageSendEvent(PlayerEntity player, String message) {
        super(player);
        this.text = message;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public boolean isPrevented() {
        return this.prevented;
    }

    @Override
    public void prevent() {
        this.prevented = true;
    }
}