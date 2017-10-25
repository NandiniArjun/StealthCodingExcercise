package com.stealth.shopping;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 *This class covers possible test cases
 */
public class CheckoutTest 
{
    @Test
    public void calculateAppleOfferPrice() {
    	Offer offer = new Offer();
    	
    	assertThat(offer.getAppleOfferBuyOneGetOneFree(2) * 0.60 == 0.60);
    }
    
    @Test
    public void calculateOrangeOfferPrice() {
    	Offer offer = new Offer();
    	
    	assertThat(offer.getOrangeThreeForThePriceOfTwo(5) * 0.25 == 0.75);
    }

}
