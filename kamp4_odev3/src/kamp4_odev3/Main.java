package kamp4_odev3;

import abstracts.GameCampaignService;
import abstracts.IGameSellService;
import abstracts.IGameService;
import adapters.GameServiceAdapters;
import concrates.GameCampaignManager;
import concrates.GameSellManager;
import concrates.GameServiceManager;
import entities.GamCampaign;
import entities.GameInfo;
import entities.GameSell;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGameService gameService = new GameServiceManager(new GameServiceAdapters());
		GameInfo gameInfo = new GameInfo();
		gameInfo.setId(61);
		gameInfo.setNationality("547");
		gameInfo.setFirstName("zehra");
		gameInfo.setLastName("eryoldas");
		gameInfo.setDateofBirth("2000");
		gameService.save(gameInfo);
		
		
		GameCampaignService campaignService= new GameCampaignManager();
		GamCampaign campaign = new GamCampaign();
		campaign.setCampaignName("sevgili");
		campaign.setDiscountRate(10);
		campaignService.add(campaign, gameInfo);
		
		
		IGameSellService gameSellService= new GameSellManager();
		GameSell gameSell = new GameSell();
		gameSell.setGameName("valorant");
		gameSell.setGamePrice(300);
		gameSell.setId(63);
		gameSellService.sell(gameSell, gameInfo, campaign);
	}

}
