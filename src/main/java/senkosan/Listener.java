package senkosan;

import javax.annotation.Nonnull;

import org.slf4j.LoggerFactory;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    public void onReady(@Nonnull ReadyEvent event) {
    	LOGGER.info("{} is ready", event.getJDA().getSelfUser().getAsTag());
    }
    
}
