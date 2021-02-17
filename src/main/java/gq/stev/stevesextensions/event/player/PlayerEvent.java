package gq.stev.stevesextensions.event.player;

import gq.stev.stevesextensions.entity.PlayerEntity;
import gq.stev.stevesextensions.event.Event;

public class PlayerEvent extends Event {
    private PlayerEntity player;

    public PlayerEvent(PlayerEntity player) {
        this.player = player;
    }

    public PlayerEntity getPlayer() {
        return this.player;
    }
}