package concrates;

import abstracts.GameCampaignService;
import entities.GamCampaign;
import entities.GameInfo;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void add(GamCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� eklendi...");
		
	}

	@Override
	public void update(GamCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� g�ncellendi...");
	}

	@Override
	public void delete(GamCampaign campaign, GameInfo gameInfo) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" kampanyas� silindi...");
	}

}