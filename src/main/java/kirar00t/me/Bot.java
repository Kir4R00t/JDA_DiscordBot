package kirar00t.me;

// Inside imports

import kirar00t.me.commands.BotCommands;

// JDA imports
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

// Misc imports
import javax.security.auth.login.LoginException;

import io.github.cdimascio.dotenv.Dotenv;


public class Bot extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        try {
            // Load API token
            Dotenv dotenv = Dotenv.load();
            String token = dotenv.get("DISCORD");

            // Loading events & commands
            JDA jda = JDABuilder.createDefault(token)
                    .addEventListeners(new BotCommands())
                    .build();

            System.out.println("Bot has started successfully !");
            
        } catch (Exception e) {
            System.out.println("Something went wrong ! " + e);
        }
    }
}
