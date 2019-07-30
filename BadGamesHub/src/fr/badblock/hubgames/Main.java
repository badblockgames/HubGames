package fr.badblock.hubgames;

import org.bukkit.plugin.java.JavaPlugin;

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
		getCommands();
	}
	public static Main getInstance() {
		return instance;
	}
	
	void getListeners() {
		
	}
	void getApi() {
		
	}
	void getCommands() {
		
	}
	
	@Override
	public void onDisable() {
		
	}

}
