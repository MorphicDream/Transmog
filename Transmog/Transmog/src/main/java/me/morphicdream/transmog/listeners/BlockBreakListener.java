package me.morphicdream.transmog.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import me.morphicdream.transmog.Transmog;

public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack stack = new ItemStack(Material.DIRT, 1);
        for(ItemStack itemStack : event.getBlock().getDrops()){
            stack = itemStack;
        }
        String version = Bukkit.getVersion();

        if(version.equalsIgnoreCase("1.8")) {
            for(ItemStack stacks : event.getBlock().getDrops()){
                stacks.setType(Material.AIR);
            }
        }else if(version.contains("1.12") || version.contains("1.11") || version.contains("1.10") ||version.contains("1.9")){
            event.setDropItems(false);
        }

        Location loc = event.getBlock().getLocation();
        if(Transmog.getTransmog(stack) != null) {
            loc.getWorld().dropItemNaturally(loc, Transmog.getTransmog(stack));
        }else{
            Block block = event.getBlock();
            Bukkit.getServer().getLogger().info("Block not in list, generating correct itemstack");
            loc.getWorld().dropItemNaturally(loc, stack);
        }
    }

}
