package kirar00t.me;

// JDA imports
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

// Misc imports
import javax.security.auth.login.LoginException;
import io.github.cdimascio.dotenv.Dotenv;

public class Bot extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        // Load API token
        Dotenv dotenv = Dotenv.load();
        String token = dotenv.get("DISCORD");

        JDABuilder.createDefault(token)
                .addEventListeners(new Bot())
                .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");
        if (message.length > 0 && message[0].equalsIgnoreCase("!hello")) {
            event.getChannel().sendMessage(STR."Hello, \{event.getAuthor().getAsMention()}!").queue();
        }
    }
}
