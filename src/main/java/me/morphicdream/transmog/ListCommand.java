package me.morphicdream.transmog;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

public class ListCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(command.getLabel().equalsIgnoreCase("transmog")){
            ItemStack val;
            for(ItemStack stack : Transmog.getAllTransmogs().keySet()){
                val = Transmog.getAllTransmogs().get(stack);
                System.out.println(stack.getType().name() + ":" + stack.getDurability() + " and " +
                        val.getType().name() + ":" + val.getDurability());
            }
        }
        return false;
    }
}
