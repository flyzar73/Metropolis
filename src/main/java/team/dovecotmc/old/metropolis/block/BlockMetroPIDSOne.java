package team.dovecotmc.old.metropolis.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.material.MapColor;

/**
 * @author Arrokoth
 * @project Metropolis
 * @copyright Copyright © 2024 Arrokoth All Rights Reserved.
 */
public class BlockMetroPIDSOne extends HorizontalDirectionalBlock {
    public BlockMetroPIDSOne() {
        super(Properties.of()
                .mapColor(MapColor.METAL)
                .noOcclusion());
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }
}
