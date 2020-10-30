package me.morphicdream.transmog;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Blocks {


//    STONE, GRANITE, POLISHED_GRANITE, DIORITE, POLISHED_DIORITE, ANDESITE, POLISHED_ANDESITE, DIRT, COARSE_DIRT,
//    PODZOL, OAK_WOOD, SPRUCE_WOOD, BIRCH_WOOD, JUNGLE_WOOD, ACACIA_WOOD, DARK_OAK_WOOD, COBBLESTONE, OAK_SAPLING,
//    SPRUCE_SAPLING, BIRCH_SAPLING, JUNGLE_SAPLING, ACACIA_SAPLING, DARK_OAK_SAPLING, SAND, RED_SAND, GRAVEL,
//    GOLD_ORE, IRON_ORE, COAL_ORE, OAK_LOG, SPRUCE_LOG, BIRCH_LOG, JUNGLE_LOG, OAK_LEAVES, SPRUCE_LEAVES, BIRCH_LEAVES,
//    JUNGLE_LEAVES, SPONGE, WET_SPONGE, GLASS, LAPIS_ORE, LAPIS_BLOCK, SANDSTONE, CHISELED_SANDSTONE, SMOOTH_SANDSTONE,
//    BED, COBWEB, DEAD_SHRUB, TALL_GRASS, FERN, DEAD_BUSH, WHITE_WOOL, ORANGE_WOOL, MAGENTA_WOOL, LIGHT_BLUE_WOOL,
//    YELLOW_WOOL, LIME_WOOL, PINK_WOOL, GRAY_WOOL, LIGHT_GRAY_WOOL, CYAN_WOOL, PURPLE_WOOL, BLUE_WOOL, BROWN_WOOL,
//    GREEN_WOOL, RED_WOOL, BLACK_WOOL, DANDELION, POPPY, BLUE_ORCHID, ALLIUM, AZURE_BLUET, RED_TULIP, ORANGE_TULIP,
//    WHITE_TULIP, PINK_TULIP, OXEYE_DAISY, GOLD_BLOCK, IRON_BLOCK, DOUBLE_STONE_SLAB, GRASS, WHEAT;

    POPPY(Material.RED_ROSE, 0),
    POLISHED_DIORITE(Material.STONE, 4),
    GOLD_BLOCK(Material.GOLD_BLOCK, 0),
    JUNGLE_WOOD(Material.WOOD, 3),
    PINK_WOOL(Material.WOOL, 6),
    OAK_WOOD(Material.WOOD, 0),
    SANDSTONE(Material.SANDSTONE, 0),
    BIRCH_SAPLING(Material.SAPLING, 2),
    COAL_ORE(Material.COAL_ORE, 0),
    AZURE_BLUET(Material.RED_ROSE, 3),
    STONE(Material.STONE, 0),
    DOUBLE_STONE_SLAB(Material.DOUBLE_STONE_SLAB2, 0),
    SPRUCE_LEAVES(Material.LEAVES, 1),
    GLASS(Material.GLASS, 0),
    PINK_TULIP(Material.RED_ROSE, 7),
    IRON_ORE(Material.IRON_ORE, 0),
    FERN(Material.LONG_GRASS, 2),
    ORANGE_TULIP(Material.RED_ROSE, 5),
    ANDESITE(Material.STONE, 5),
    ALLIUM(Material.RED_ROSE, 2),
    WHITE_TULIP(Material.RED_ROSE, 6),
    LAPIS_BLOCK(Material.LAPIS_BLOCK, 0),
    SPRUCE_LOG(Material.LOG, 1),
    RED_SAND(Material.SAND, 1),
    POLISHED_GRANITE(Material.STONE, 2),
    LIGHT_BLUE_WOOL(Material.WOOL, 3),
    DIORITE(Material.STONE, 3),
    OAK_LEAVES(Material.LEAVES, 0),
    COARSE_DIRT(Material.DIRT, 1),
    GRANITE(Material.STONE, 1),
    JUNGLE_LOG(Material.LOG, 3),
    LAPIS_ORE(Material.LAPIS_ORE, 0),
    SPRUCE_WOOD(Material.WOOD, 1),
    DANDELION(Material.YELLOW_FLOWER, 0),
    BROWN_WOOL(Material.WOOL, 12),
    MAGENTA_WOOL(Material.WOOL, 2),
    GRAVEL(Material.GRAVEL, 0),
    YELLOW_WOOL(Material.WOOL, 4),
    BLUE_ORCHID(Material.RED_ROSE, 1),
    JUNGLE_SAPLING(Material.SAPLING, 3),
    LIME_WOOL(Material.WOOL, 5),
    TALL_GRASS(Material.LONG_GRASS, 1),
    RED_WOOL(Material.WOOL, 14),
    OAK_SAPLING(Material.SAPLING, 0),
    BED(Material.BED, 0),
    PURPLE_WOOL(Material.WOOL, 10),
    DEAD_BUSH(Material.DEAD_BUSH, 0),
    DARK_OAK_SAPLING(Material.SAPLING, 5),
    LIGHT_GRAY_WOOL(Material.WOOL, 8),
    CYAN_WOOL(Material.WOOL, 9),
    GREEN_WOOL(Material.WOOL, 13),
    JUNGLE_LEAVES(Material.LEAVES, 3),
    BLACK_WOOL(Material.WOOL, 15),
    DEAD_SHRUB(Material.LONG_GRASS, 0),
    OAK_LOG(Material.LOG, 0),
    GRASS(Material.GRASS, 0),
    IRON_BLOCK(Material.IRON_BLOCK, 0),
    GRAY_WOOL(Material.WOOL, 7),
    RED_TULIP(Material.RED_ROSE, 4),
    BIRCH_LOG(Material.LOG, 2),
    BIRCH_LEAVES(Material.LEAVES, 2),
    ACACIA_SAPLING(Material.SAPLING, 4),
    DIRT(Material.DIRT, 0),
    SPRUCE_SAPLING(Material.SAPLING, 1),
    SAND(Material.SAND, 0),
    COBWEB(Material.WEB, 0),
    SPONGE(Material.SPONGE, 0),
    DARK_OAK_WOOD(Material.WOOD, 5),
    OXEYE_DAISY(Material.RED_ROSE, 8),
    BIRCH_WOOD(Material.WOOD, 2),
    POLISHED_ANDESITE(Material.STONE, 5),
    ACACIA_WOOD(Material.WOOD, 4),
    WET_SPONGE(Material.SPONGE, 1),
    GOLD_ORE(Material.GOLD_ORE, 0),
    ORANGE_WOOL(Material.WOOL, 1),
    WHEAT(Material.WHEAT, 0),
    WHITE_WOOL(Material.WOOL, 0),
    COBBLESTONE(Material.COBBLESTONE, 0),
    PODZOL(Material.DIRT, 2),
    SMOOTH_SANDSTONE(Material.SANDSTONE, 2),
    BLUE_WOOL(Material.WOOL, 11),
    CHISELED_SANDSTONE(Material.SANDSTONE, 1);


    private Material material;
    private int data;
    private static final List<Blocks> list = Collections.unmodifiableList(Arrays.asList(values()));

    Blocks(Material material, int data) {
        this.material = material;
        this.data = data;
    }

    public static List<Blocks> getList(){
        return list;
    }

    public static ItemStack getRandomItemStack(){
        return list.get(Transmog.getRandom().nextInt(list.size())).getItemStack();
    }

    public Material getMaterial(){
        return this.material;
    }

    public int getData(){
        return this.data;
    }

    public ItemStack getItemStack(){
        ItemStack stack = new ItemStack(getMaterial(), 1);
        if(getData() > 0) {
            stack.setDurability((short) getData());
        }
        return stack;
    }
}
