package com.stevenpaw.moretosee.client;

import com.stevenpaw.moretosee.init.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class RenderLayers {

    public static void setupRenderLayers(){
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRUGAR_FLAG.get(), RenderType.translucent());
    }
}
