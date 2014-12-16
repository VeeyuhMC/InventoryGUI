package us.legioncraft.inventorygui.inventory;

import java.util.HashMap;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUI {
	private String name;
	private Inventory inv;
	private int slots;
	private HashMap<Integer, ItemStack> items;
	
	public GUI(String name, int slots, Inventory inv, HashMap<Integer, ItemStack> items){
		this.name = name;
		this.inv = inv;
		this.slots = slots;
		this.items = items;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSlots(){
		return slots;
	}
	
	public Inventory getInventory(){
		return inv;
	}
	
	public HashMap<Integer, ItemStack> getItems(){
		return items;
	}
	
	public void createInvntory(){
		for(int i = 0; i >= slots; i++){
			inv.setItem(i, items.get(i));
		}
	}
		
	public void addItems(){
		for(int i : items.keySet()){
			inv.setItem(i, items.get(i));
		}
	}
}
