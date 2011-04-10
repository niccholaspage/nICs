package com.niccholaspage.nICs.ics;

import org.bukkit.World;
import org.bukkit.block.Sign;

import com.niccholaspage.nICs.nICs;

public class MC1238 implements IC {

	@Override
	public Boolean run(nICs plugin, boolean power, World world, Sign sign) {
		return null;
	}

	@Override
	public String getName() {
		return "AUTOPOWER";
	}

}
