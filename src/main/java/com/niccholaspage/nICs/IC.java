package com.niccholaspage.nICs;

import org.bukkit.event.block.BlockRedstoneEvent;


public interface IC {
	public abstract Boolean run(nICs plugin, BlockRedstoneEvent event);

	public abstract String getName();
	
	public abstract String canPlace(String[] lines);
}
