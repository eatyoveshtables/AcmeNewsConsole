package com.acme.controllers;

import java.util.ArrayList;
import java.util.List;

import com.acme.models.Ad;
import com.acme.models.Newspaper;
import com.acme.utilities.ManagerStatusCode;


public class NewspaperAdManager
{
	private List<Newspaper> newspaperList;
	private List<Ad> adList;
	
	public NewspaperAdManager()
	{
		newspaperList = new ArrayList<Newspaper>();
		adList = new ArrayList<Ad>();
	}
	
	public List<Newspaper> getNewspapers()
	{
		return newspaperList;
	}
	
	public List<Ad> getAds()
	{
		return adList;
	}
	
	public void addNewspaper(String name)
	{	
		Newspaper newspaperToBeAdded = new Newspaper(name);
		newspaperList.add(newspaperToBeAdded);
	}
	
	public void createNewAd(String description)
	{
		Ad newAd = new Ad(description);
		adList.add(newAd);
	}
	
	public ManagerStatusCode postAdInNewspaper(int newsPaperId, int adId)
	{
		if(!isValidNewspaperID(newsPaperId))
		{
			return ManagerStatusCode.INVALID_NEWSPAPER_ID;
		}	
		
		if(!isValidAdID(adId))
		{
			return ManagerStatusCode.INVALID_AD_ID;
		}
		
		if(newspaperList.get(newsPaperId-1).postAd(adId))
		{
			return ManagerStatusCode.SUCCESS;
		}
		else
		{
			return ManagerStatusCode.AD_ALREADY_POSTED;
		}
	}
	
	public ManagerStatusCode removeAdFromNewspaper(int newsPaperId, int adId)
	{
		if(!isValidNewspaperID(newsPaperId))
		{
			return ManagerStatusCode.INVALID_NEWSPAPER_ID;
		}	
		
		if(!isValidAdID(adId))
		{
			return ManagerStatusCode.INVALID_AD_ID;
		}
		
		if(newspaperList.get(newsPaperId-1).removeAd(adId))
		{
			return ManagerStatusCode.SUCCESS;
		}
		else
		{
			return ManagerStatusCode.AD_NOT_POSTED;
		}
	}
	
	
	private boolean isValidNewspaperID(int id)
	{
		return ((id > 0) && (id <= newspaperList.size()));
	}
	
	private boolean isValidAdID(int id)
	{
		return ((id > 0) && (id <= adList.size()));
	}
	
}

