package fr.badblock.hubgames.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.badblock.hubgames.Main;

public class BadPlayerMoveEvent implements Listener {
	
	Main main = Main.getInstance();
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();	
		
	}

}
