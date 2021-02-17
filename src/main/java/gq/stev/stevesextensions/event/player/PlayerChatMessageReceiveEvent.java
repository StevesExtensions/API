package gq.stev.stevesextensions.event.player;

import gq.stev.stevesextensions.entity.PlayerEntity;
import gq.stev.stevesextensions.event.Preventable;
import gq.stev.stevesextensions.text.Text;

public class PlayerChatMessageReceiveEvent extends PlayerEvent implements Preventable {
    private final Text text;
    private boolean prevented = false;

    public PlayerChatMessageReceiveEvent(PlayerEntity player, Text text) {
        super(player);
        this.text = text;
    }

    public Text getText() {
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