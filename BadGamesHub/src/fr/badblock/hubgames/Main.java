package fr.badblock.hubgames;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.badblock.gameapi.GameAPI;
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
		getApi();
		loadConfig();
	}
	public static Main getInstance() {
		return instance;
	}
	
	void getListeners() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BadPlayerMoveEvent(), this);
	}
	public GameAPI getApi() {
		return GameAPI.getAPI();
	}
	void loadConfig() {
			getConfig().options().copyDefaults(true);
			saveConfig();
	}
	
	@Override
	public void onDisable() {
		
	}

}
