package fr.badblock.hubgames;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.badblock.hubgames.listeners.BadPlayerMoveEvent;

public class Main extends JavaPlugin{
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		setup();
	}
	
	public void setup() {
		instance = this;
		getListeners();
		loadConfig();
	}
	public static Main getInstance() {
		return instance;
	}
	
	void getListeners() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BadPlayerMoveEvent(), this);
	}
	void loadConfig() {
			getConfig().options().copyDefaults(true);
			saveConfig();
	}
	
	@Override
	public void onDisable() {
		
	}

}
