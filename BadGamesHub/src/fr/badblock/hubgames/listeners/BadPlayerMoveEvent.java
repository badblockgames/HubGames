package fr.badblock.hubgames.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.badblock.hubgames.Main;
import fr.badblock.hubgames.managing.CuboidManaging;

public class BadPlayerMoveEvent implements Listener {
	
	Main main = Main.getInstance();
	CuboidManaging cuboids = new CuboidManaging();
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();	
		if(cuboids.getPvPCuboid().containsLocation(p.getLocation())){
			p.sendMessage("salut mec ça va");
		}
	}

}
