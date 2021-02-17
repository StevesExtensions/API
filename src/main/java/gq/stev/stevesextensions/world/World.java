package gq.stev.stevesextensions.world;

import gq.stev.stevesextensions.block.BlockData;

public interface World {
    BlockData getBlock(BlockPosition position);
    void setBlock(BlockPosition position, BlockData data);
}