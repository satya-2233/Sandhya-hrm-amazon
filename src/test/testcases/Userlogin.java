package test.testcases;

import test.resources.generic.WebLibrary;

public class Userlogin extends WebLibrary
{
	public void user_login(String url, String Uname, String Pwd)
	{
		
		//Launch the application
		plog = "Launch the Application";
		flog = "Unable to launch the application";
		 OpenUrl(url);
		 wait(4);
		 
		 
		 //Enter the username		
		plog = "Enter the Username";
		flog = "Unable to enter the username";
		SetText(".//*[@type='text']", Uname);
		wait(4);
		
		//Enter the password	
		plog = "Enter the password";
		flog = "Unable to enter the password";
		SetText(".//*[@type='password']", Pwd);
		wait(4);
		
		//click the login button		
		plog = "click the login button";
		flog = "Unable to click the login button";
		ClickElement(".//*[@id='btnLogin']");
		wait(4);
		
		
		
	}
	public static void logout()
	{
		//click on logout
		plog = "";
		flog = "";
	}
	
}
