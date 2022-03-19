package senkosan;

import javax.annotation.Nonnull;

import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Listener.class);
	private final CommandManager manager = new CommandManager();
	
    public void onReady(@Nonnull ReadyEvent event) {
    	
    	LOGGER.info("{} is ready", event.getJDA().getSelfUser().getAsTag());
    	
    }
    
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
		
		User user = event.getAuthor();

        if (user.isBot() || event.isWebhookMessage()) {
            return;
        }

        String prefix = Config.get("prefix");
        String raw = event.getMessage().getContentRaw();
		
        if (raw.startsWith(prefix)) {
            manager.handle(event);
        }
	}
    
}
