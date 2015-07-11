package com.kyuricard.blocks;

import java.util.ConcurrentModificationException;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TeemoBlock extends Block {

	public TeemoBlock() {
		super(Material.circuits);
		this.setUnlocalizedName("teemoblock");
	}
	
	@Override
	public void onBlockClicked(World arg0, BlockPos arg1, EntityPlayer arg2) {
		arg2.addPotionEffect(new PotionEffect(Potion.wither.id, 120, 5));
		arg2.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 120, 3));
	}
	
	@Override
	public boolean onBlockActivated(World arg0, BlockPos arg1,
			IBlockState arg2, EntityPlayer arg3, EnumFacing arg4, float arg5,
			float arg6, float arg7) {
		try {
			this.onBlockClicked(arg0, arg1, arg3);
		} catch (ConcurrentModificationException cme) {
			System.out.println("[Mod Error]: Pene");
		}
		return true;
	}
	
	@Override
	public Item getItemDropped(IBlockState arg0, Random arg1, int arg2) {
		return Item.getItemFromBlock(Blocks.air);
	}
}
