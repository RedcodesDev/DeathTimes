package dev.redcodes.deathtimes.data;

import dev.redcodes.deathtimes.DeathTimes;

public class MessageManager {

	public static String getMessage(String key) {
		FileConfig config = new FileConfig("DeathTimes", "messages.yml");

		String msg = config.getString(key);

		if (msg != null) {
			return DeathTimes.getPrefix() + msg.replace("&", "§");
		}
		
		return "§4There was an Error while getting the message with the key \"" + key + "\".";
	}

}
