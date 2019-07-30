package fr.badblock.hubgames.managing;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import fr.badblock.hubgames.Main;
import fr.badblock.hubgames.utils.Cuboid;

public class CuboidManaging {
	
	Main main = Main.getInstance();
	
	public Cuboid getPvPCuboid() {
		World world = Bukkit.getWorld(main.getConfig().getString("worldname"));
		int x = main.getConfig().getInt("pvp.cuboid.x1");
		int y = main.getConfig().getInt("pvp.cuboid.y1");
		int z = main.getConfig().getInt("pvp.cuboid.z1");
		int x1 = main.getConfig().getInt("pvp.cuboid.x2");
		int y1 = main.getConfig().getInt("pvp.cuboid.y2");
		int z1 = main.getConfig().getInt("pvp.cuboid.z2");
		Location pvp1 = new Location(world,x,y,z);
		Location pvp2 = new Location(world,x1,y1,z1);
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		
		
		return cuboid;
	}

}
