package kirar00t.me.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotCommands extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        // Lenny
        if (event.getName().equals("lenny")) {
            event.reply("( ͡° ͜ʖ ͡°)").queue();
        }
        // Ping
        else if (event.getName().equals("ping")) {
            event.reply("Pong !");
        }
    }
}
