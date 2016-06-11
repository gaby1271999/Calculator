package me.trolking1.Calculator;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player){
			Player p = (Player) sender;
			
			if (label.equalsIgnoreCase("plopkoek")){
				plopkoek(p);
			}
				
				
		}
		
		return false;
	}
	
	public void plopkoek(Player p ){
		ItemStack i = new ItemStack(Material.COOKIE);
		ItemMeta im = i.getItemMeta();
		im.setDisplayName("plopkoek");
		i.setItemMeta(im);
		p.getInventory().addItem(i);
		
	}
	
}
