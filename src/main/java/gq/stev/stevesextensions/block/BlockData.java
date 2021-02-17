package gq.stev.stevesextensions.block;

public abstract class BlockData {
    private final Block block;

    public BlockData(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return this.block;
    }

    public abstract byte writeToByte();
    public abstract void readFromByte(byte data);
}
