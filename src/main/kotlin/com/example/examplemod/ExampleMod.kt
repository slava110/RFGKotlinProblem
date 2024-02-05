package com.example.examplemod

import com.creativemd.creativecore.CreativeCore
import net.minecraftforge.fml.common.Mod

@Mod(modid = "examplemod")
object ExampleMod {

    fun test() {
        CreativeCore.instance.onServerStarting()
    }
}