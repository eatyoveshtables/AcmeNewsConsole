package com.acme;

import com.acme.controllers.NewspaperAdManager;
import com.acme.utilities.ConsoleMessages;
import com.acme.utilities.ConsoleHelper;

class AcmeNewsProgram
{
	
	public static void main(String args[])
	{
		NewspaperAdManager manager = new NewspaperAdManager();
		String userInput = "";
		
		System.out.println(ConsoleMessages.WELCOME_MESSAGE);
		
		while(!userInput.equals("q"))
		{
			System.out.println(ConsoleMessages.OPTIONS_MESSAGE);
			
			switch(ConsoleHelper.readUserInputMenuOptions())
			{
				case VIEW_EVERYTHING: 
					ConsoleHelper.displayNewspapersWithAds(manager.getNewspapers(), manager.getAds());
					break;
				case VIEW_NEWSPAPERS: 
					ConsoleHelper.displayAllNewspapers(manager.getNewspapers());
					break;
				case VIEW_ADS:
					ConsoleHelper.displayAllAds(manager.getAds());
					break;
				case POST_AD:
					int newspaperID, adID;
					if(manager.getNewspapers().isEmpty())
					{
						System.out.println(ConsoleMessages.NO_NEWSPAPERS_ADDED);
						continue;
					}
					
					if(manager.getAds().isEmpty())
					{
						System.out.println(ConsoleMessages.NO_ADS_CREATED);
						continue;
					}

					ConsoleHelper.displayAllNewspapers(manager.getNewspapers());
					System.out.println(ConsoleMessages.POST_AD_MESSAGE);
					newspaperID = ConsoleHelper.readNumericUserInput();
					if(newspaperID == -1)
					{
						continue;
					}
					
					ConsoleHelper.displayAllAds(manager.getAds());
					System.out.println(ConsoleMessages.ENTER_AD_ID_POST);
					adID = ConsoleHelper.readNumericUserInput();
					if(adID == -1)
					{
						continue;
					}

					switch(manager.postAdInNewspaper(newspaperID, adID))
					{
						case SUCCESS:
							System.out.println(ConsoleMessages.POST_AD_SUCCESS);
							break;
						case INVALID_AD_ID:
							System.out.println(ConsoleMessages.INVALID_AD_ID_DNE);
							break;
						case INVALID_NEWSPAPER_ID:
							System.out.println(ConsoleMessages.INVALID_NEWSPAPER_ID_DNE);
							break;
						case AD_ALREADY_POSTED:
							System.out.println(ConsoleMessages.AD_ALREADY_POSTED);
							break;
						default:
							break;
					}
					break;
				case REMOVE_AD:
					if(manager.getNewspapers().isEmpty())
					{
						System.out.println(ConsoleMessages.NO_NEWSPAPERS_ADDED);
						continue;
					}
					
					if(manager.getAds().isEmpty())
					{
						System.out.println(ConsoleMessages.NO_ADS_CREATED);
						continue;
					}

					ConsoleHelper.displayAllNewspapers(manager.getNewspapers());
					System.out.println(ConsoleMessages.REMOVE_AD_MESSAGE);
					newspaperID = ConsoleHelper.readNumericUserInput();
					if(newspaperID == -1)
					{
						continue;
					}
					
					ConsoleHelper.displayAllAds(manager.getAds());
					System.out.println(ConsoleMessages.ENTER_AD_ID_REMOVE);
					adID = ConsoleHelper.readNumericUserInput();
					if(adID == -1)
					{
						continue;
					}
					
					switch(manager.removeAdFromNewspaper(newspaperID, adID))
					{
						case SUCCESS:
							System.out.println(ConsoleMessages.REMOVE_AD_SUCCESS);
							break;
						case INVALID_AD_ID:
							System.out.println(ConsoleMessages.INVALID_AD_ID_DNE);
							break;
						case INVALID_NEWSPAPER_ID:
							System.out.println(ConsoleMessages.INVALID_NEWSPAPER_ID_DNE);
							break;
						case AD_NOT_POSTED:
							System.out.println(ConsoleMessages.AD_NOT_POSTED);
							break;
						default:
							break;
					}
					break;
				case ADD_NEWSPAPER:
					System.out.println(ConsoleMessages.ENTER_NEWSPAPER_NAME);
					manager.addNewspaper(ConsoleHelper.readStringUserInput());
					System.out.println(ConsoleMessages.NEWSPAPER_ADDED_SUCCESS);
					break;
				case CREATE_AD:
					System.out.println(ConsoleMessages.ENTER_AD_DESCRIPTION);
					manager.createNewAd(ConsoleHelper.readStringUserInput());
					System.out.println(ConsoleMessages.AD_CREATED_SUCCESS);
					break;
				case EXIT:
				default:
					System.out.println(ConsoleMessages.GOODBYE_MESSAGE);
					return;
			}
			
		}
		
		return; 
	}
	

}

