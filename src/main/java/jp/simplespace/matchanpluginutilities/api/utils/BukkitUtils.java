package jp.simplespace.matchanpluginutilities.api.utils;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BukkitUtils {
    public static void playSoundAll(Sound sound, SoundCategory category,float volume,float pitch){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.playSound(player.getLocation(),sound,category,volume,pitch);
        }
    }
    public static void playSoundAll(Sound sound,float volume,float pitch){
        playSoundAll(sound,SoundCategory.MASTER,volume,pitch);
    }
    public static void giveItemAll(ItemStack item){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.getInventory().addItem(item);
        }
    }
    public static void clearInventoryAll(){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.getInventory().clear();
        }
    }
}
