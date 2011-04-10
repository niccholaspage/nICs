package com.niccholaspage.nICs.ics;

import org.bukkit.World;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public class MC1238 implements IC {

	@Override
	public Boolean run(nICs plugin, boolean power, World world, Sign sign) {
		if (power) return false; else return true;
	}

	@Override
	public String getName() {
		return "ON REPEATER";
	}
    public boolean isInt(String i){
    	try {
    		Integer.parseInt(i);
    		return true;
    	} catch(NumberFormatException nfe){
    		return false;
    	}
    }
	public String canPlace(String[] lines){
		if (!(isInt(lines[2]))) return "The third line must be an integer!";
		return "";
	}
}
