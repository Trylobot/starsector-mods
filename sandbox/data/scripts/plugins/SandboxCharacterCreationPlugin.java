package data.scripts.plugins;

import java.util.ArrayList;
import java.util.List;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.CargoAPI.CrewXPLevel;
import com.fs.starfarer.api.characters.CharacterCreationPlugin;
import com.fs.starfarer.api.characters.MutableCharacterStatsAPI;
import com.fs.starfarer.api.fleet.FleetMemberType;

public class SandboxCharacterCreationPlugin implements CharacterCreationPlugin
{
	
	public static class ResponseImpl implements Response
	{
		private String text;
		public ResponseImpl(String text)
		{
			this.text = text;
		}
		public String getText()
		{
			return text;
		}
	}
	
	// Not using an enum for this because Janino doesn't support it.
	// It does, apparently, support using enums defined elsewhere - just can't compile new ones.
	private ResponseImpl SOMETHING_ELSE_1 = new ResponseImpl("Did something else");
	private ResponseImpl SOMETHING_ELSE_2 = new ResponseImpl("Did something else");
	
	private int stage = 0;
	private String [] prompts = new String [] {
		"Early in your career, you...",
		"More recently, you...",
	};
	
	public String getPrompt()
	{
		if (stage < prompts.length)
			return prompts[stage];
		return null;
	}

	@SuppressWarnings("unchecked")
	public List getResponses()
	{
		List result = new ArrayList();
		if (stage == 0) {
			result.add(SOMETHING_ELSE_1);
		}
		else if (stage == 1)
		{
			result.add(SOMETHING_ELSE_2);
		}
		return result;
	}
	
	public void submit(Response response, CharacterCreationData data)
	{
		if (stage == 0)
		{
			data.addStartingShipChoice("shuttle_Attack");
			data.setStartingLocationName("SandboxSystem");
			data.getStartingCoordinates().set(0, 0);
		}
		++stage;
	}

	public void startingShipPicked(String variantId, CharacterCreationData data)
	{
		
	}

}







