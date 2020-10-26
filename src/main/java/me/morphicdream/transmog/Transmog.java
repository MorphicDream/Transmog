package me.morphicdream.transmog;

import me.morphicdream.transmog.listeners.BlockBreakListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class Transmog extends JavaPlugin {

    private static List<Material> materialList = Arrays.asList(Material.values());
    private static Map<Material, Material> list = new HashMap<>();
    private static Random random = new Random();
    private static List<ItemStack> transmogs = new ArrayList<>();

    @Override
    public void onEnable() {

        Bukkit.getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);

        //Lets sort out the Blocks from the Material
        for (Material mat : materialList) {
            if (mat.isBlock()) {
                list.put(mat, calculateTransmog(mat));
            }
        }
    }

    public static void generateTransmogs(ItemStack itemStack){
        int meta = itemStack.getDurability();
        if(meta == 0){
            transmogs.add(itemStack);
        }
    }

    public static Random getRandom(){
        return random;
    }

    private static Material calculateTransmog(Material material) {
        List<Material> temp = new ArrayList<>();
        for (Material mat : materialList) {
            if (mat != material && mat.isBlock()) {
                temp.add(mat);
            }
        }
        return temp.get(getRandom().nextInt(temp.size()));
    }

    public static Material getTransmog(Material material) {
        return list.get(material);
    }

    public static int checkMetaData(Material material) {
        int range = 0;
        switch (material) {
            case STONE:
                range = 6;//0-6
                break;
            case DIRT:
            case QUARTZ_BLOCK:
            case SANDSTONE:
            case RED_SANDSTONE:
            case GRASS:
                range = 2;//0-2
                break;
            case WOOD:
            case SAPLING:
                range = 5;//0-5
                break;
            case SAND:
            case LOG_2:
            case LEAVES_2:
                range = 1;//0-1
                break;
            case LOG:
            case LEAVES:
                range = 3;//0-3
                break;
        }
        return range;
    }
}
