package com.niccholaspage.nICs.ics;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public class MC1238 implements IC {
	public boolean power;
	@Override
	public Boolean run(nICs plugin, boolean power, World world, Sign sign) {
		if (power == false) return null;
		Block block = plugin.getBlockBehindOfSign(sign);
		Block above = sign.getWorld().getBlockAt(block.getX(), block.getY() + 1, block.getZ());
		if (above.getType().equals(Material.getMaterial(sign.getLine(2).toUpperCase()))) return true; else return false;
	}

	@Override
	public String getName() {
		return "IS BLOCK ABOVE?";
	}
	public String canPlace(String[] lines){
		if (Material.getMaterial(lines[2].toUpperCase()) == null) return "The third line must be an item name/ID!";
		return "";
	}
}
