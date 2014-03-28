package com.acme.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.acme.models.Newspaper;

class NewspaperTest
{
	public static final String NEWSPAPER_TITLE = "Test Newspaper";
	
	public static void main(String args[])
	{
		int[] testAdIds = {1,2,3,4,5};
		Newspaper newspaper = new Newspaper(NEWSPAPER_TITLE);
		
		if(!newspaper.getName().equals(NEWSPAPER_TITLE))
		{
			System.out.println("TEST 1 - FAILURE: Didn't return correct name.\n");
		}
		else
		{
			System.out.println("TEST 1 - SUCCESS\n");
		}
		
		if(!newspaper.postAd(testAdIds[0]))
		{
			System.out.println("TEST 2 - FAILURE: Didn't post ad (list empty).\n");
		}
		else
		{
			System.out.println("TEST 2 - SUCCESS\n");
		}
		
		if(newspaper.postAd(testAdIds[0]))
		{
			System.out.println("TEST 3 - FAILURE: Posted already existing ad.\n");
		}
		else
		{
			System.out.println("TEST 3 - SUCCESS\n");
		}
		
		if(!newspaper.postAd(testAdIds[4]))
		{
			System.out.println("TEST 4 - FAILURE: Didn't post ad (list not empty).\n");
		}
		else
		{
			System.out.println("TEST 4 - SUCCESS\n");
		}
		
		if(!newspaper.removeAd(testAdIds[4]))
		{
			System.out.println("TEST 5 - FAILURE: Didn't remove ad (list not empty).\n");
		}
		else
		{
			System.out.println("TEST 5 - SUCCESS\n");
		}
		
		if(newspaper.removeAd(testAdIds[1]))
		{
			System.out.println("TEST 6 - FAILURE: Removed not-existing ad (list not empty).\n");
		}
		else
		{
			System.out.println("TEST 6 - SUCCESS\n");
		}
		
		newspaper.postAd(testAdIds[1]);
		newspaper.postAd(testAdIds[2]);
		newspaper.postAd(testAdIds[3]);
		
		int count = 0;
		for(int i : newspaper.getAdIds())
		{
			if(testAdIds[count] != i)
			{
				System.out.println("TEST 7 - FAILURE: Ad Ids incorrect.\n");
			}
			count++;
		}
		
		System.out.println("TEST 7 - SUCCESS\n");
		
		
		//post ad that isn't there
		//post ad that already is posted
		//remove ad that exists
		//remove ad that hasn't been posted
		//test getAdIds to make sure correct ids exist
	}
	
}