package senkosan.command.commands;

import java.util.List;

import net.dv8tion.jda.api.EmbedBuilder;
import senkosan.command.CommandContext;
import senkosan.command.ICommand;

public class InviteCommand implements ICommand{
	public void handle(CommandContext ctx) {
		
		String[] invitereplies = {
				"Hey! I heard you needed a Invite! Does this help?",
				"Oh? Nya need a invite?.. here you go Nya!",
				"Nya! Mews ur invite!"
				};
		
		EmbedBuilder bot = new EmbedBuilder();
		bot.addField(invitereplies[(int)(Math.random()*invitereplies.length)], "Nothing here for now.", true);
		bot.setAuthor(ctx.getAuthor().getName(), ctx.getAuthor().getAvatarUrl(), ctx.getAuthor().getEffectiveAvatarUrl());
		
		EmbedBuilder server = new EmbedBuilder();
		server.addField(invitereplies[(int)(Math.random()*invitereplies.length)], "Nothing here for now.", true);
		server.setAuthor(ctx.getAuthor().getName(), ctx.getAuthor().getAvatarUrl(), ctx.getAuthor().getEffectiveAvatarUrl());
		
		ctx.getChannel().sendMessage("You didn't say what invite you wanted, so i am giving both to you!").queue();
        ctx.getChannel().sendMessageEmbeds(bot.build(), server.build()).queue();
	}

	@Override
	public String getName() {
		return "invite";
	}
	
	public List<Object> getAliases() {
        return List.of("iv");
    }
}
