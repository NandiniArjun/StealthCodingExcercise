package com.stealth.shopping;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Checkout 
{
	static Logger logger = Logger.getLogger(Checkout.class.getName());
	
    public static void main( String[] args )
    {
    	try{
	    	Object inputItems[] = Arrays.stream(args).map(String::new).toArray();
	    	
	    	FruitCount fruitCount = new FruitCount();
	    	Offer offer = new Offer();
	    	
	    	//Skip "[" and "]" from input [ Apple, Apple, Orange, Apple ]
	    	for(int count = 1; count < (inputItems.length - 1); count++){
	    		
	    		String fruit = (String)inputItems[count];
	    		if(fruit.contains(",")) {
	    			fruit = fruit.substring(0, fruit.indexOf(","));
	    		}
	    		switch(fruit.toUpperCase()) {
	    		
	    			case "APPLE": fruitCount.setApples();
	    						  break;
	    			case "ORANGE": fruitCount.setOranges();
	    						   break;
	    		}
	    	}
	    	double applePrice = offer.getAppleOfferBuyOneGetOneFree(fruitCount.getApples()) * 0.60;
	    	double orangePrice = offer.getOrangeThreeForThePriceOfTwo(fruitCount.getOranges()) * 0.25;
	    	double totalPrice = applePrice + orangePrice;
	    	System.out.println("Total price of fruits is:£"+totalPrice);
	    	
	    } catch(Exception e){
	    	logger.log( Level.SEVERE, e.getMessage(), e);
	    }
    }
}
