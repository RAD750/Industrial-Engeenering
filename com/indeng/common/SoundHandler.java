package com.indeng.common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import com.indeng.core.Core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

@SideOnly(Side.CLIENT)
public class SoundHandler {
	
	@ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
		System.out.println("[RGB] Loading Sound for RGBMod");
        try
        {
            event.manager.addSound("machines/bruciatore.ogg", new File("resources/mod/sound/bruciatore.ogg"));
        }
        catch (Exception e)
        {
            System.err.println("Failed to register one or more sounds.");
        }
    }
}
