package fr.badblock.hubgames.managing;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import fr.badblock.hubgames.Main;
import fr.badblock.hubgames.utils.Cuboid;

public class CuboidManaging {
	
	Main main = Main.getInstance();
	
	public static HashMap<Player,Cuboid> pvpMap = new HashMap<>();
	public static HashMap<Player,Cuboid> spleefMap = new HashMap<>();
	public static HashMap<Player,Cuboid> archeryMap = new HashMap<>();
	public static HashMap<Player,Cuboid> blockpartyMap = new HashMap<>();
	public static HashMap<Player,Cuboid> raceMap = new HashMap<>();
	
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
		if(pvp1 == null || pvp2 == null) {
			System.out.println("ERROR, ONE/BOTH LOCATION/LOCATIONS IS/ARE NULL");
		}
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		
		return cuboid;
	}
	
	public Cuboid getSpleefCuboid() {
		World world = Bukkit.getWorld(main.getConfig().getString("worldname"));
		int x = main.getConfig().getInt("spleef.cuboid.x1");
		int y = main.getConfig().getInt("spleef.cuboid.y1");
		int z = main.getConfig().getInt("spleef.cuboid.z1");
		int x1 = main.getConfig().getInt("spleef.cuboid.x2");
		int y1 = main.getConfig().getInt("spleef.cuboid.y2");
		int z1 = main.getConfig().getInt("spleef.cuboid.z2");
		Location pvp1 = new Location(world,x,y,z);
		Location pvp2 = new Location(world,x1,y1,z1);
		if(pvp1 == null || pvp2 == null) {
			System.out.println("ERROR, ONE/BOTH LOCATION/LOCATIONS IS/ARE NULL");
		}
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		return cuboid;
	}
	public Cuboid getArcheryCuboid() {
		World world = Bukkit.getWorld(main.getConfig().getString("worldname"));
		int x = main.getConfig().getInt("archery.cuboid.x1");
		int y = main.getConfig().getInt("archery.cuboid.y1");
		int z = main.getConfig().getInt("archery.cuboid.z1");
		int x1 = main.getConfig().getInt("archery.cuboid.x2");
		int y1 = main.getConfig().getInt("archery.cuboid.y2");
		int z1 = main.getConfig().getInt("archery.cuboid.z2");
		Location pvp1 = new Location(world,x,y,z);
		Location pvp2 = new Location(world,x1,y1,z1);
		if(pvp1 == null || pvp2 == null) {
			System.out.println("ERROR, ONE/BOTH LOCATION/LOCATIONS IS/ARE NULL");
		}
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		return cuboid;
	}
	public Cuboid getBpCuboid() {
		World world = Bukkit.getWorld(main.getConfig().getString("worldname"));
		int x = main.getConfig().getInt("blockparty.cuboid.x1");
		int y = main.getConfig().getInt("blockparty.cuboid.y1");
		int z = main.getConfig().getInt("blockparty.cuboid.z1");
		int x1 = main.getConfig().getInt("blockparty.cuboid.x2");
		int y1 = main.getConfig().getInt("blockparty.cuboid.y2");
		int z1 = main.getConfig().getInt("blockparty.cuboid.z2");
		Location pvp1 = new Location(world,x,y,z);
		Location pvp2 = new Location(world,x1,y1,z1);
		if(pvp1 == null || pvp2 == null) {
			System.out.println("ERROR, ONE/BOTH LOCATION/LOCATIONS IS/ARE NULL");
		}
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		return cuboid;
	}
	public Cuboid getRaceCuboid() {
		World world = Bukkit.getWorld(main.getConfig().getString("worldname"));
		int x = main.getConfig().getInt("race.cuboid.x1");
		int y = main.getConfig().getInt("race.cuboid.y1");
		int z = main.getConfig().getInt("race.cuboid.z1");
		int x1 = main.getConfig().getInt("race.cuboid.x2");
		int y1 = main.getConfig().getInt("race.cuboid.y2");
		int z1 = main.getConfig().getInt("race.cuboid.z2");
		Location pvp1 = new Location(world,x,y,z);
		Location pvp2 = new Location(world,x1,y1,z1);
		if(pvp1 == null || pvp2 == null) {
			System.out.println("ERROR, ONE/BOTH LOCATION/LOCATIONS IS/ARE NULL");
		}
		Cuboid cuboid = new Cuboid(pvp1, pvp2);
		return cuboid;
	}

}
