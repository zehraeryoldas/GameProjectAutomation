package entities;

import interfaeentities.GameCampaignEntity;

public class GamCampaign implements GameCampaignEntity{
	private String campaignName;
	private int discountRate;
	
	public GamCampaign() {
		
	}

	public GamCampaign(String campaignName, int discountRate) {
		super();
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}

