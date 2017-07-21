package org.ufquizbowl;

import org.ufquizbowl.listeners.ListenerImpl;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventDispatcher;

/**
 * Created by Jonathen on 7/13/2017.
 */
public class ScorekeeperApp {

    public static void main(String[] args)
    {
        IDiscordClient client = ClientCreator.createClient(System.getenv("BOT_TOKEN"), true);
        EventDispatcher dispatcher = client.getDispatcher();
        dispatcher.registerListener(new ListenerImpl());
    }
}
