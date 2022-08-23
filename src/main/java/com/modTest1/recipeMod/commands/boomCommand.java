package com.modTest1.recipeMod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class boomCommand {
    public boomCommand(CommandDispatcher<CommandSourceStack> dispatcher){
        dispatcher.register(Commands.literal("accio").executes((command) -> {return boom(command);}));
    }
    private int boom(CommandContext<CommandSourceStack> command){

        if(command.getSource().getEntity() instanceof Player){
            Player player = (Player) command.getSource().getEntity();
            ItemStack stack = new ItemStack(Item.byId(122));
            player.getInventory().add(stack);
        }
        return 1;
    }
}
