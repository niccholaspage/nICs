package com.niccholaspage.nICs.ics;

import org.bukkit.block.Sign;
import org.bukkit.event.block.BlockRedstoneEvent;

import com.niccholaspage.nICs.nICs;

public class MC1239 implements IC {
	public Sign sign;
	public Boolean run(nICs plugin, BlockRedstoneEvent event) {
		boolean power = (event.getNewCurrent() > 0);
		if (power){
			this.sign = (Sign)event.getBlock().getState();
			plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
				public void run(){
					Sign sign = getSign();
				if (!(isInt(sign.getLine(2)))) sign.setLine(2, "0");
				sign.setLine(2, (Integer.parseInt(sign.getLine(2)) + 1) + "");
				sign.update();
				}
			});
		}
		return null;
	}
	public String getName() {
		return "POWER ADDER";
	}
    private boolean isInt(String i){
    	try {
    		Integer.parseInt(i);
    		return true;
    	} catch(NumberFormatException nfe){
    		return false;
    	}
    }
	public Sign getSign(){
		return sign;
	}
	public String canPlace(String[] lines){
		return "";
	}
}
