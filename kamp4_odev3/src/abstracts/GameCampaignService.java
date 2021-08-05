package abstracts;

import entities.GamCampaign;
import entities.GameInfo;

public interface GameCampaignService {

	void add(GamCampaign campaign,GameInfo gameInfo);
	
	void update(GamCampaign campaign,GameInfo gameInfo);
	
	void delete(GamCampaign campaign,GameInfo gameInfo);

}
