package me.morphicdream.transmog;

import me.morphicdream.transmog.listeners.BlockBreakListener;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class Transmog extends JavaPlugin {

    private static Map<ItemStack, ItemStack> list = new HashMap<>();
    private static Random random = new Random();

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        getCommand("transmog").setExecutor(new ListCommand());
        calculateTransmogs();
    }

    public static Random getRandom() {
        return random;
    }

    private static void calculateTransmogs() {
        final int quarter = Blocks.getList().size() / 4;
        int count = 0;
        int blockCount = 0;
        ItemStack stack1, stack2;
        List<Blocks> blocksList = new ArrayList<>();

        for(Blocks blocks : Blocks.getList()){

        }

//        while (count < half) {
//            stack1 = Blocks.getList().get(count).getItemStack();
//            stack2 = Blocks.getList().get(half + count).getItemStack();
//            list.put(stack1, stack2);
//            list.put(stack2, stack1);
//            count++;
//        }

    }

    public static ItemStack getTransmog(ItemStack stack) {
        return list.get(stack);
    }

    public static Map<ItemStack, ItemStack> getAllTransmogs(){
        return list;
    }
}