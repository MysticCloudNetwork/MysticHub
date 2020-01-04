package net.mysticcloud.spigot.hub.listeners;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import net.mysticcloud.spigot.hub.Main;

public class PlayerListener implements Listener {

	public PlayerListener(Main plugin) {
		Main.getPlugin().getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if(e.getAction().equals(Action.PHYSICAL)) {
			if(e.getClickedBlock().getRelative(BlockFace.DOWN).getType().equals(Material.REDSTONE_BLOCK)){
				e.getPlayer().setVelocity(new Vector(e.getPlayer().getEyeLocation().getDirection().getX()*2, 1, e.getPlayer().getEyeLocation().getDirection().getZ()*2));
			}
		}
	}

}
