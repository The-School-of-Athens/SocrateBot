package timux;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;

public class GuildAudioManager {

	public final AudioPlayer player;
	public final TrackScheduler scheduler;

	public GuildAudioManager(AudioPlayerManager manager) 
	{
		player = manager.createPlayer();
		scheduler = new TrackScheduler(player);
		player.addListener(scheduler);
	}

	public AudioPlayerSendHandler getSendHandler() 
	{
		return new AudioPlayerSendHandler(player);
	}

}