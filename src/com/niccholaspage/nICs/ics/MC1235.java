package com.niccholaspage.nICs.ics;

import org.bukkit.World;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public class MC1235 implements IC {
	public Boolean run(nICs plugin, boolean power, World world, Sign sign) {
		if (power == true) {
			if (sign.getLine(2).equalsIgnoreCase("day")) {
				world.setTime(0);
			} else if (sign.getLine(2).equalsIgnoreCase("night")) {
				world.setTime(15000);
			}
		}
		return null;
	}

	public String getName() {
		return "TIME SET";
	}
	
	public String canPlace(String[] lines){
		if ((!(lines[2].equalsIgnoreCase("day"))) && !((lines[2].equalsIgnoreCase("night"))))
			return "Line 3 must equal 'day' or 'night'";
		return "";
	}
}