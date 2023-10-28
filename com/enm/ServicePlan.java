package com.enm;

public enum ServicePlan {
GOLD(5000),SILVER(7000),DIAMOND(8000),PLATINUM(10000);
	private double additionalAmount;
	private ServicePlan(double additionalAmount) {
		this.additionalAmount=additionalAmount;
	}
	public double getAdditionalAmount() {
		return additionalAmount;
	}
	public void setAdditionalAmount(double additionalAmount) {
		this.additionalAmount = additionalAmount;
	}
	
}
