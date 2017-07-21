package org.ufquizbowl.listeners;

import sx.blah.discord.api.events.IListener;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IMessage;

/**
 * Created by Jonathen on 7/13/2017.
 */
public class ListenerImpl implements IListener<MessageReceivedEvent>{
    @Override
    public void handle(MessageReceivedEvent messageReceivedEvent) {
        IMessage message = messageReceivedEvent.getMessage();

        IChannel channel = message.getChannel();

        channel.sendMessage(message.toString());
    }
}
