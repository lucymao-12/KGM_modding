package com.modTest1.recipeMod.events;

import com.modTest1.recipeMod.commands.boomCommand;
import com.modTest1.recipeMod.test1;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = test1.MOD_ID)
public class modEvents{

    @SubscribeEvent
    public static void onCommandRegister(RegisterCommandsEvent event){
        new boomCommand(event.getDispatcher());
        ConfigCommand.register(event.getDispatcher());
    }
}
