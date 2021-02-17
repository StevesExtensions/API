package gq.stev.stevesextensions.network;

import gq.stev.stevesextensions.network.packet.Packet;

public interface PlayerConnection {
    void sendPacket(Packet packet);
}