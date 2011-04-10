package com.niccholaspage.nICs.ics;

import org.bukkit.World;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public interface IC {
	public abstract Boolean run(nICs plugin, boolean power, World world, Sign sign);

	public abstract String getName();
}
