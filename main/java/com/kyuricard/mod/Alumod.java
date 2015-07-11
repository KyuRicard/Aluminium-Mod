package com.kyuricard.mod;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kyuricard.blocks.AluOre;
import com.kyuricard.blocks.TeemoBlock;

@Mod(modid = Alumod.MODID, version = Alumod.VERSION)
public class Alumod {
	public static final String MODID = "alumod";
	public static final String VERSION = "Alfa";
	public CreativeTabs alumodBlocks = AlumodTab.AlumodBlocks;
	ArrayList<Block> blocks; 
	ArrayList<Item> items;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		blocks = new ArrayList<Block>();
		items = new ArrayList<Item>();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {		
		blockAdd();
		itemAdd();
		blockRegister();
	}

	private void blockRegister() {
		for (Block b : blocks) {
			GameRegistry.registerBlock(b, b.getUnlocalizedName());
			b.setCreativeTab(alumodBlocks);
		}
		
	}

	private void itemAdd() {
				
	}

	private void blockAdd() {
		blocks.add(new AluOre());
		blocks.add(new TeemoBlock());
	}
}
