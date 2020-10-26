package me.morphicdream.transmog.listeners;

import me.morphicdream.transmog.Transmog;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Material material = event.getBlock().getType();
        event.setDropItems(false);
        Location loc = event.getBlock().getLocation();
        int standard = Transmog.checkMetaData(material) == 0 ? 0 :
                Transmog.getRandom().nextInt(Transmog.checkMetaData(material));

        ItemStack itemStack = new ItemStack(Transmog.getTransmog(material), 1, (short) standard);
        loc.getWorld().dropItemNaturally(loc, itemStack);
    }

}
