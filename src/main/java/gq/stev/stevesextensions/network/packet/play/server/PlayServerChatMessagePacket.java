package gq.stev.stevesextensions.network.packet.play.server;

import gq.stev.stevesextensions.network.packet.Packet;
import gq.stev.stevesextensions.text.Text;

import java.util.UUID;

// TODO move to a separate library
public class PlayServerChatMessagePacket implements Packet {
    enum Position {
        CHAT,
        SYSTEM_MESSAGE,
        GAME_INFO
    }

    private final Text text;
    private final Position position;
    private final UUID sender;

    public PlayServerChatMessagePacket(Text text, PlayServerChatMessagePacket.Position position, UUID sender) {
        this.text = text;
        this.position = position;
        this.sender = sender;
    }

    public Text getText() {
        return this.text;
    }

    public Position getPosition() {
        return this.position;
    }

    public UUID getSender() {
        return this.sender;
    }
}