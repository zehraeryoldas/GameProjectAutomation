package abstracts;

import entities.GamCampaign;
import entities.GameInfo;
import entities.GameSell;


public interface IGameSellService {
	void sell(GameSell gameSell,GameInfo gameInfo,GamCampaign campaign);
}
