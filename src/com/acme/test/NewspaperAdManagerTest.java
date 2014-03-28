package com.acme.test;

import com.acme.controllers.NewspaperAdManager;
import com.acme.utilities.ManagerStatusCode;

class NewspaperAdManagerTest
{
	public static final String NEWSPAPER_TITLE = "Test Newspaper";
	public static final String AD_DESCRIPTION = "TEST AD";
	
	public static void main(String args[])
	{
		NewspaperAdManager nam = new NewspaperAdManager();
		
		if(nam.postAdInNewspaper(1, 1) != ManagerStatusCode.INVALID_NEWSPAPER_ID)
		{
			System.out.println("TEST 1 - FAILURE: Didn't detect invalid newspaper ID");
		}
		else
		{
			System.out.println("TEST 1 - SUCCESS");
		}
		
		if(nam.removeAdFromNewspaper(1, 1) != ManagerStatusCode.INVALID_NEWSPAPER_ID)
		{
			System.out.println("TEST 2 - FAILURE: Didn't detect invalid newspaper ID");
		}
		else
		{
			System.out.println("TEST 2 - SUCCESS");
		}
		
		nam.addNewspaper(NEWSPAPER_TITLE);
		nam.addNewspaper(NEWSPAPER_TITLE + "1");
		nam.addNewspaper(NEWSPAPER_TITLE + "2");
		
		if(nam.postAdInNewspaper(1, 1) != ManagerStatusCode.INVALID_AD_ID)
		{
			System.out.println("TEST 3 - FAILURE: Didn't detect invalid ad ID");
		}
		else
		{
			System.out.println("TEST 3 - SUCCESS");
		}
		
		if(nam.removeAdFromNewspaper(1, 1) != ManagerStatusCode.INVALID_AD_ID)
		{
			System.out.println("TEST 4 - FAILURE: Didn't detect invalid ad ID");
		}
		else
		{
			System.out.println("TEST 4 - SUCCESS");
		}
		
		
		nam.createNewAd(AD_DESCRIPTION);
		nam.createNewAd(AD_DESCRIPTION + "1");
		nam.createNewAd(AD_DESCRIPTION + "2");
		
		if(nam.postAdInNewspaper(1, 1) != ManagerStatusCode.SUCCESS)
		{
			System.out.println("TEST 5 - FAILURE: Didn't post ad in newspaper");
		}
		else
		{
			System.out.println("TEST 5 - SUCCESS");
		}
		
		if(nam.postAdInNewspaper(1, 1) != ManagerStatusCode.AD_ALREADY_POSTED)
		{
			System.out.println("TEST 6 - FAILURE: Didn't detect that ad had already been posted in newspaper.");
		}
		else
		{
			System.out.println("TEST 6 - SUCCESS");
		}
		
		
		if(nam.removeAdFromNewspaper(2, 2) != ManagerStatusCode.AD_NOT_POSTED)
		{
			System.out.println("TEST 7 - FAILURE: Didn't detect ad not posted in newspaper.");
		}
		else
		{
			System.out.println("TEST 7 - SUCCESS");
		}
		
		if(nam.removeAdFromNewspaper(1, 1) != ManagerStatusCode.SUCCESS)
		{
			System.out.println("TEST 8 - FAILURE: Didn't successfully remove ad from newspaper.");
		}
		else
		{
			System.out.println("TEST 8 - SUCCESS");
		}
		
	}
}