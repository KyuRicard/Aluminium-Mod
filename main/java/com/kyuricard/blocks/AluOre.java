package com.kyuricard.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AluOre extends Block {
	
	public AluOre() {
		super(Material.rock);
		this.setHardness(2.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setUnlocalizedName("aluore");
	}	
	
	@Override
	public void dropBlockAsItemWithChance(World p_dropBlockAsItemWithChance_1_,
			BlockPos p_dropBlockAsItemWithChance_2_,
			IBlockState p_dropBlockAsItemWithChance_3_,
			float p_dropBlockAsItemWithChance_4_,
			int p_dropBlockAsItemWithChance_5_) {
		
		super.dropBlockAsItemWithChance(p_dropBlockAsItemWithChance_1_,
				p_dropBlockAsItemWithChance_2_, p_dropBlockAsItemWithChance_3_,
				p_dropBlockAsItemWithChance_4_, p_dropBlockAsItemWithChance_5_);
	}
	
	@Override
	public int getExpDrop(IBlockAccess arg0, BlockPos arg1, int arg2) {		
		return super.getExpDrop(arg0, arg1, arg2);
	}
	

}
