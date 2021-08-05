package concrates;

import abstracts.IGameSellService;
import entities.GamCampaign;
import entities.GamCampaign;
import entities.GameInfo;
import entities.GameSell;

public class GameSellManager implements IGameSellService{

	@Override
	public void sell(GameSell gameSell, GameInfo gameInfo, GamCampaign campaign) {
		// TODO Auto-generated method stub
		
		System.out.println("oyun:"+gameSell.getGameName()+" fiyat:"+gameSell.getGamePrice()+
				" indirim hali:"+gameSell.getGamePrice()*0.9+" oyun sahibi:"+gameInfo.getFirstName()+".. oyun sat�ld�....");
	}

}
