package com.niccholaspage.nICs;

import java.util.HashMap;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;

import com.niccholaspage.nICs.ics.*;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

public class nICs extends JavaPlugin {
	private final nICsBlockListener blockListener = new nICsBlockListener(this);
	//Create IC hashmap :)
	public final HashMap<String, IC> ics = new HashMap<String, IC>();
	//Perma
	public PermissionHandler permissions;
    @Override
	public void onDisable() {
		//Print "Basic Disabled" on the log.
		System.out.println("nICs Disabled");
		
	}
    @Override
	public void onEnable() {
		//Create the pluginmanage pm.
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.REDSTONE_CHANGE, this.blockListener, Event.Priority.Normal, this);
	    pm.registerEvent(Event.Type.SIGN_CHANGE, this.blockListener, Event.Priority.Normal, this);
       //Get the infomation from the yml file.
        PluginDescriptionFile pdfFile = this.getDescription();
        //Add all the ICs
        setupICs();
        //Perma.
        setupPermissions();
        //Print that the plugin has been enabled!
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
	}
    private void setupICs(){
    	ics.put("MC1235", new MC1235());
    	ics.put("MC1236", new MC1236());
    	ics.put("MC1237", new MC1237());
    	ics.put("MC1239", new MC1239());
    }
    private void setupPermissions() {
        Plugin test = getServer().getPluginManager().getPlugin("Permissions");

        if (permissions == null)
          if (test != null) {
            permissions = ((Permissions)test).getHandler();
          } else {
            System.out.println("Permission system not enabled. ICs will work for everyone.");
          }
      }
}
