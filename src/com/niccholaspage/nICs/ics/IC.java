package com.niccholaspage.nICs.ics;

import org.bukkit.event.block.BlockRedstoneEvent;

import com.niccholaspage.nICs.nICs;

public interface IC {
	public abstract Boolean run(nICs plugin, BlockRedstoneEvent event);

	public abstract String getName();
	
	public abstract String canPlace(String[] lines);
}
