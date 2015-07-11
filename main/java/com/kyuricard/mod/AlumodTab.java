package com.kyuricard.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class AlumodTab {
	public static CreativeTabs AlumodBlocks = new CreativeTabs("AlumodBlocks") {
		
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item.getItemFromBlock(Blocks.barrier);
		}
	};
}
