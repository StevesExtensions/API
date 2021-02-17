package gq.stev.stevesextensions.block;

import gq.stev.stevesextensions.util.Identifier;

public class Block {
    private final Identifier identifier;

    public Block(Identifier identifier) {
        this.identifier = identifier;
    }

    public Identifier getIdentifier() {
        return this.identifier;
    }

    public BlockEntity createBlockEntity() {
        return null;
    }
}