package com.niccholaspage.nICs.ics;

import org.bukkit.World;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public class MC1237 implements IC {
	public Boolean run(nICs plugin, boolean power, World world, Sign sign){
		if (power == true){
			for (int i = 0; i < world.getPlayers().size(); i++){
				world.getPlayers().get(i).sendMessage((sign.getLine(2) + sign.getLine(3)).replace("&", "¤"));
			}
		}
		return null;
	}
	
	public String getName(){
		return "WORLD BROADCAST";
	}
	
	public String canPlace(String[] lines){
		if (lines[2].equals("")) return "Line 3 must contain a string!";
		return "";
	}
}
