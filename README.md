AcmeNewsConsole
===============

Structure of classes:

models
Newspaper: represents a newspaper and contains the title and all adIds associated with it
Ad: represents an ad. simply contains a description of the ad.

controllers
NewspaperAdManager.java: this is where the bulk of the interesting code takes place. 
NewspaperAdManager manipulates a list of Ads and Newspapers to accomplish creating/posting/removing ads.

utilities
ConsoleMessages: a bunch of static Strings that contain messages for console output. 
ConsoleHelper: does all of the user input reading from console and all of the output 
except a few lines done by the main program.
ManagerStatusCodes: This is an enumeration of various success/error codes that can be returned from the NewspaperAdManager
MenuOptionCodes: an enumeration of the various Menu options

test
NewspaperTest: unit test program for the Newspaper class
NewspaperAdManagerTest: unit test program for the NewspaperAdManager class

AcmeNewsProgram.java: main program 


External libraries: Apache Commons StringUtils. The StringUtils library was used a 
few times to help with user input checking. The main use was to check if the user's input was numeric or not.

