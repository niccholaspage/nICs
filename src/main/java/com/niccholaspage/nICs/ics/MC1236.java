package com.niccholaspage.nICs.ics;

import org.bukkit.block.Sign;
import org.bukkit.event.block.BlockRedstoneEvent;

import com.niccholaspage.nICs.IC;
import com.niccholaspage.nICs.nICs;

public class MC1236 implements IC {
	public Boolean run(nICs plugin, BlockRedstoneEvent event){
		Sign sign = (Sign)event.getBlock().getState();
		boolean power = (event.getNewCurrent() > 0);
		if (power == true) plugin.getServer().broadcastMessage((sign.getLine(2) + sign.getLine(3)).replace("&", "¤"));
		return null;
	}
	public String getName(){
		return "BROADCAST";
	}
	
	public String canPlace(String[] lines){
		if (lines[2].equals("")) return "Line 3 must contain a string!";
		return null;
	}
}
