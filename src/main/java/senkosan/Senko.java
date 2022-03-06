package senkosan;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Senko {
	
	public static void main(String[] args) throws LoginException {
		JDABuilder jda = JDABuilder.createDefault(Config.get("token"));
		jda.setActivity(Activity.watching("Season 2"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Listener());
		jda.build();
	}
}
