package me.morphicdream.transmog.listeners;

import me.morphicdream.transmog.Transmog;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class KillMobsListener implements Listener {

    @EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        List<ItemStack> items = event.getDrops();
        Location location = event.getEntity().getLocation();
        int num = 0;
        for(ItemStack stack : event.getDrops()){
            stack.setType(Material.AIR);
        }
        while(num < items.size()){
            if(Transmog.getTransmog(items.get(num)) != null){
                location.getWorld().dropItemNaturally(location, Transmog.getTransmog(items.get(num)));
            }else{
                location.getWorld().dropItemNaturally(location, items.get(num));
            }
            num++;
        }
    }
}
