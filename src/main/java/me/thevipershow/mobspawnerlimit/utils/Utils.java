package me.thevipershow.mobspawnerlimit.utils;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.EntityEffect;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.EntityType;

public class Utils {

    public static int chunkHasMaterial(final Material material, final Chunk chunk) {
        int targetBlocksCounter = 0;
        for (BlockState blockState : chunk.getTileEntities()) {
            if (blockState.getType() == material) {
                targetBlocksCounter++;
            }
        }
        return targetBlocksCounter;
    }

    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
