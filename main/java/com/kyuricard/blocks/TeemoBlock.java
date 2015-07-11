package com.kyuricard.blocks;

import java.util.ConcurrentModificationException;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
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
		try {	
			arg0.playSoundAtEntity(arg2, "alumod:teemo", 1.0f, 1.0f);
			MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "kill @e");		
			arg0.destroyBlock(arg1, true);
		} catch (ConcurrentModificationException cme) {
			Minecraft.getMinecraft().thePlayer.sendChatMessage("Teemo is with us");
		} 		
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
