package us.legioncraft.inventorygui.example;

import org.bukkit.plugin.java.JavaPlugin;

import us.legioncraft.inventorygui.inventory.GUI;
import us.legioncraft.inventorygui.inventory.InventoryManager;

public class ExampleMain extends JavaPlugin{
	
	public void onEnable(){
		InventoryManager.getInstance().addGUI(new ExampleGUI(this), new ExampleEvent());
	}
	
}
