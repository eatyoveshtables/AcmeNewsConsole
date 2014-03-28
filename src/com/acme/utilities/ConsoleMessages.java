package com.acme.utilities;

public class ConsoleMessages
{
	
	public static final String WELCOME_MESSAGE = "Welcome to Acme Advertisement Editor! "
			+ "This console program is so intuitive it doesn't even need a GUI "
			+ "to assist you in keeping track of Acme "
			+ "Advertisements.\n";
	public static final String OPTIONS_MESSAGE = "Please select an action from the following list or (q)uit:\n"
			+ "1 View Newspapers with Ads\n2 View Newspapers\n3 View Ads\n4 Add Newspapers\n5 "
			+ "Create Ads\n6 Post Ad\n7 Remove Ad\n";
	public static final String GOODBYE_MESSAGE = "Thanks for using Acme Advertisement Editor! Goodbye.";
	
	public static final String POST_AD_MESSAGE = "Please enter the ID of the newspaper you wish to post an Ad in:\n";
	public static final String REMOVE_AD_MESSAGE = "Please enter the ID of the newspaper you wish to remove an Ad from:\n";
	public static final String ENTER_AD_ID_POST = "Enter the ID of the Ad to be posted:\n";
	public static final String ENTER_AD_ID_REMOVE = "Enter the ID of the Ad to be removed:\n";
	public static final String POST_AD_SUCCESS = "Ad was posted successfully!\n";
	public static final String AD_ALREADY_POSTED = "Ad has already been posted to this newspaper.\n";
	public static final String REMOVE_AD_SUCCESS = "Ad was removed successfully!\n";
	public static final String AD_NOT_POSTED = "Ad has not been posted to this newspaper.\n";
	public static final String AD_CREATED_SUCCESS = "Ad has been successfully created!\n";
	public static final String NEWSPAPER_ADDED_SUCCESS = "Newspaper has been successfully added!\n";
	
	public static final String ENTER_NEWSPAPER_NAME = "Enter the name of the newspaper to be added:\n";
	public static final String ENTER_AD_DESCRIPTION = "Enter the description of the new ad:\n";
	
	public static final String NO_NEWSPAPERS_ADDED = "No newspapers have been added yet.\n";
	public static final String NO_ADS_CREATED = "No Ads have been created yet.\n";
	public static final String INVALID_MENU_OPTION = "Invalid Menu Option chosen. Please enter a number 1-5.\n";
	public static final String INVALID_INPUT_FORMAT_NUMERIC = "Invalid input format. Please enter a numeric ID.\n";
	public static final String INVALID_NEWSPAPER_ID_DNE = "Invalid Newspaper ID - ID does not exist.\n";
	public static final String INVALID_NEWSPAPER_ID_FORMAT = "Invalid Newspaper ID - ID not in numeric format.\n";
	public static final String INVALID_AD_ID_DNE = "Invalid Ad ID - ID does not exist.\n";
	public static final String INVALID_AD_ID_FORMAT = "Invalid Ad ID - ID not in numeric format.\n";
	public static final String IO_ERROR = "IOException thrown. Program will exit.\n";
}