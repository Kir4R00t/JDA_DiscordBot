package kirar00t.me;

// JDA imports
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

// Misc imports
import javax.security.auth.login.LoginException;
import io.github.cdimascio.dotenv.Dotenv;

public class Bot extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        // Load API token
        Dotenv dotenv = Dotenv.load();
        String token = dotenv.get("DISCORD");

        // Starting Events & commands
        JDABuilder.createDefault(token)
                .addEventListeners(new Bot())
                .build();

    }
}
