package com.invocative.visiblebarriers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

@Mod.EventBusSubscriber
public class ModListener {

    @SubscribeEvent
    public void toggleKey(InputEvent.KeyInputEvent event) {
        //Barrier visibility toggle
        if (KeyBindings.TOGGLE_KEY.isPressed()) {
            NewCustomBarrierBlock.toggleVisibility();
            Minecraft.getMinecraft().renderGlobal.loadRenderers();
            Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Barrier visibility is: " + (NewCustomBarrierBlock.IS_SHOWING ? "On!" : "Off!")));
        }
    }
}