package com.acme.models;

import java.util.HashSet;
import java.util.Set;

public class Newspaper
{
	private String name;
	private Set<Integer> adIds;
	
	
	public Newspaper(String name)
	{
		this.name = name;
		this.adIds = new HashSet<Integer>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Set<Integer> getAdIds()
	{
		return this.adIds;
	}
	
	
	/**
	 * 
	 * id - ID of Ad to be posted to Newspaper
	 * returns false if Ad has already been posted, true otherwise 
	 */
	public boolean postAd(int id)
	{
		return adIds.add(id);
	}
	
	/**
	 * 
	 * id - ID of Ad to be posted to Newspaper
	 * returns false if Ad hasn't been posted to Newspaper, true otherwise 
	 */
	public boolean removeAd(int id)
	{
		return adIds.remove(id);
	}
	
}