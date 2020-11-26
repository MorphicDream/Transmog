package me.morphicdream.transmog.listeners;

import me.morphicdream.transmog.Transmog;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Iterator;

public class LeafDecayListener implements Listener {

    @EventHandler
    public void onLeafDecay(LeavesDecayEvent event){
        Collection<ItemStack> stacks = event.getBlock().getDrops();
        String version = Bukkit.getVersion();
        Iterator<ItemStack> iterator = stacks.iterator();

        if (version.equalsIgnoreCase("1.8")) {
            for (ItemStack stack : event.getBlock().getDrops()) {
                stack.setType(Material.AIR);
            }
        }

        if (!stacks.isEmpty()) {
            Location loc = event.getBlock().getLocation();
            while (iterator.hasNext()) {
                ItemStack item = iterator.next();
                if (Transmog.getTransmog(item) != null) {
                    loc.getWorld().dropItemNaturally(loc, Transmog.getTransmog(item));
                } else {
                    Bukkit.getServer().getLogger().info("Block not in list, generating correct item stack");
                    for (ItemStack stack : stacks) {
                        loc.getWorld().dropItemNaturally(loc, stack);
                    }
                }
            }
        }
    }
}
