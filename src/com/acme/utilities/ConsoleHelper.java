package com.acme.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.acme.models.Ad;
import com.acme.models.Newspaper;


public class ConsoleHelper
{
	
	public static void displayAllNewspapers(List<Newspaper> newspaperList)
	{
		if(newspaperList.isEmpty())
		{
			System.out.println("No newspapers added yet.\n");
			return; 
		}
		
		System.out.println("Newspapers\n-----------");
		int index = 1;
		for(Newspaper newspaper : newspaperList)
		{
			System.out.println(index + " " + newspaper.getName());
			index++;
		}
		
		System.out.println("\n");
	}
	
	public static void displayAllAds(List<Ad> adList)
	{
		if(adList.isEmpty())
		{
			System.out.println("No ads created yet.\n");
			return; 
		}
		
		System.out.println("Ads\n-----------");
		int index = 1;
		for(Ad ad : adList)
		{
			System.out.println(index + " " + ad.getDescription());
			index++;
		}
		
		System.out.println();
	}
	
	public static void displayNewspapersWithAds(List<Newspaper> newspaperList, List<Ad> adList)
	{
		if(newspaperList.isEmpty())
		{
			System.out.println("No newspapers added yet.\n");
			return; 
		}
		
		for(Newspaper newspaper : newspaperList)
		{
			System.out.println(newspaper.getName() + "\n-------------");
			
			Set<Integer> adIds = newspaper.getAdIds();
			if(adIds.isEmpty())
			{
				System.out.println("No ads posted yet.\n");
				return; 
			}
			else
			{
				for(int adId : adIds)
				{
					System.out.println(adList.get(adId-1).getDescription());
				}
			}
			
			System.out.println();
		}
		
	}
	
	public static MenuOptionCodes readUserInputMenuOptions()
	{
		String userInput = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(!userInput.equals("q"))
		{
			try 
			{
				userInput = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(ConsoleMessages.IO_ERROR);
				return MenuOptionCodes.EXIT;
			}
			
			if((userInput).equals("1"))
			{
				return MenuOptionCodes.VIEW_EVERYTHING;
			}
			else if((userInput).equals("2"))
			{
				return MenuOptionCodes.VIEW_NEWSPAPERS;
			}
			else if((userInput).equals("3"))
			{
				return MenuOptionCodes.VIEW_ADS;
			}
			else if((userInput).equals("4"))
			{
				return MenuOptionCodes.ADD_NEWSPAPER;
			}
			else if((userInput).equals("5"))
			{
				return MenuOptionCodes.CREATE_AD;
			}
			else if((userInput).equals("6"))
			{
				return MenuOptionCodes.POST_AD;
			}
			else if((userInput).equals("7"))
			{
				return MenuOptionCodes.REMOVE_AD;
			}
			else if((userInput).equals("q"))
			{
				return MenuOptionCodes.EXIT;
			}
			
			System.out.println(ConsoleMessages.INVALID_MENU_OPTION);
		}
		
		return MenuOptionCodes.EXIT;
	}
	
	public static int readNumericUserInput()
	{
		String userInput = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(!userInput.equals("q"))
		{
			try 
			{
				userInput = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(ConsoleMessages.IO_ERROR);
				return -1;
			}
			
			userInput = StringUtils.strip(userInput);
			if(!(userInput).isEmpty() && StringUtils.isNumeric(userInput))
			{
				return Integer.valueOf(userInput);
			}
			else
			{
				System.out.println(ConsoleMessages.INVALID_INPUT_FORMAT_NUMERIC);
			}
		}
		
		return -1;
	}
	
	public static String readStringUserInput()
	{
		String userInput = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(userInput.isEmpty())
		{
			try 
			{
				userInput = br.readLine();
			} catch (IOException e) 
			{
				System.out.println(ConsoleMessages.IO_ERROR);
				e.printStackTrace();
			}
		}
		
		return userInput;		
	}
	
}