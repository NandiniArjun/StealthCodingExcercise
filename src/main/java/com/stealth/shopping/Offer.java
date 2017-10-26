package com.stealth.shopping;

public class Offer {
	
	//Get the total billable apples
	int getAppleOfferBuyOneGetOneFree(int appleCount){
		
		int applePriceCount = appleCount / 2;
		applePriceCount += appleCount % 2;
		return applePriceCount;
	}
	
	//Get the total billable oranges
	int getOrangeThreeForThePriceOfTwo(int orangeCount){
		
		int orangePriceCount = orangeCount / 3;
		orangePriceCount += orangeCount % 3;
		return orangePriceCount;
	}
}
