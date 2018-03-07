package test.amazon.testcases;

import test.resources.generic.WebLibrary;

public class Amazontestcase1 extends WebLibrary
{
	public static void createAccount()
	{
		
		
//		enableTakingScreenshots();
//		enableHighlight();
//		SetImplicitWait(5);
//		
		//Launch the Amazon application
		try {
			plog = "Able to launch the application";
			flog = "unable to open the application";
			OpenUrl("https:www.gmail.com");
			
//			//Create amazon account
//			MouseOverElement("//a[@id='nav-link-accountList']");
//			
//			plog = "Able to click on start here link";
//			flog = "unable to click on start here link";
//			ClickElement(".//*[@id='nav-flyout-ya-newCust']/a");
//			
//			plog = "Username is entered";
//			flog = "unable to enter username";
//			SetText("//input[@name='customerName']",getData("uname"));
//			
//			plog = "password is entered";
//			flog = "unable to enter password";
//			SetText(".//*[@id='ap_email']",getData("email"));
//			
//			plog = "Able to enter the password";
//			flog = "unable to enter the password";
//			SetText("//input[@id='ap_password']",getData("pwd"));
//			
//			
//			plog = "Able to enter the confirm password";
//			flog = "unable to enter the confirm password";
//			SetText("//input[@name='passwordCheck']",getData("Repwd"));
//			
//			plog = "Able to click create account link";
//			flog = "unable to click create acount link";
//			ClickElement("//input[@id = 'continue']");
		} catch (Exception e) {
			
			System.out.println(" undefined");
		}
		
		
	}
	
	public static void login()
	{
		
		enableTakingScreenshots();
		enableHighlight();
		SetImplicitWait(5);
		
		//Launch the Amazon application
		plog = "Able to launch the application";
		flog = "unable to open the application";
		OpenUrl(getData("URL"));
		
		//login the application
		MouseOverElement(".//*[@id='nav-link-accountList']");
		
		plog = "Able to click on signin link";
		flog = "unable to click on signin link";
		ClickElement(".//*[@id='nav-flyout-ya-signin']/a/span");
		
		plog = "Able to enter email id";
		flog = "unable to enter email id";
		SetText(".//*[@id='ap_email']", getData("emailid"));
	
		plog = "Able to click on sign in button";
		flog = "unable to click on signin button";
		ClickElement(".//*[@id='continue']");
		
		
	}
	
	
}
