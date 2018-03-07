package test.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import test.resources.generic.WebLibrary;

public class Applyleave extends WebLibrary
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
	public static void apply_leave()
	{
		
			enableHighlight();
			enableTakingScreenshots();
			SetImplicitWait(5);
			
			Applyleave a = new Applyleave();
			a.user_login(getData("URL"), getData("Username"), getData("Password"));
			
			plog = "Homepage Opened successfully";
			flog = "Unable to open homepage";
			String verifylogin = driver.findElement(By.xpath("//a[starts-with(@id,'welc')]")).getText();
			System.out.println(verifylogin);
			
			if(verifylogin.equals("Welcome Arun"))
			{
				System.out.println("Orange hrm homepage opened successfully");
			}
		
		//Mouse over on leave
		plog = "Able to mouseover the leave Element";
		flog = "Unable to mouseover the leave Element";
		MouseOverElement("//b[text()='Leave']");
		
		wait(5);
		//click on apply
		plog = "Able to click on apply";
		flog = "Unable toclick on apply";
		ClickElement("//a[@id='menu_leave_applyLeave']");
		// verify apply button open or not
		//plog = "successfully opens the apply";
		//flog = "unSuccessfull";
		//enableHighlight();
		String element = driver.findElement(By.xpath("//h1[text()='Apply Leave']")).getText();
		if(element.equals("Apply Leave"))
		{
		System.out.println("Successfully logged into apply button");	
		}
		SetImplicitWait(10);
		plog = "Able to select on leave type";
		flog = "Unable to select leave type";
		SelectOPtionByText("//*[@id='applyleave_txtLeaveType']", getData("Option"));
		
		plog = "Able to set from date";
		flog = "Unable to set fromdate";
		SetText("//input[@id='applyleave_txtFromDate']", getData("Fromdate"));
		wait(5);
		ClickElement(".//*[@id='frmLeaveApply']/fieldset/ol/li[3]/img");
		
		wait(5);
		plog = "Able to set todate";
		flog = "Unable to set todate";
		ClearElement(".//*[@id='applyleave_txtToDate']");
		wait(2);
		//driver.findElement(By.xpath(".//*[@id='applyleave_txtToDate']")).sendKeys("2018-03-08");
		wait(5);
		SetText(".//*[@id='applyleave_txtToDate']", getData("Todate"));
		
		plog = "Able to set comment";
		flog = "unable to set comment";
		SetText("//textarea[@id='applyleave_txtComment']", getData("Comment"));
		
		wait(10);
		plog = "Able to click apply button";
		flog = "unable to click apply button";
		ClickElement("//input[@type='button' and @value='Apply']");
	}
	
	
	
	public static void verify_User_Leaves()
	
	{
		enableTakingScreenshots();
		enableHighlight();
		SetImplicitWait(5);
		//Launch the application
		plog = "Launch the Application";
		flog = "Unable to launch the application";
		 OpenUrl(getData("URL"));
		 
		 
		 //Enter the username		
		plog = "Enter the Username";
		flog = "Unable to enter the username";
		SetText(".//*[@id='txtUsername']", getData("Username"));
		
		//Enter the password	
		plog = "Enter the password";
		flog = "Unable to enter the password";
		SetText(".//*[@id='txtPassword']", getData("Password"));
		
		//click the login button		
		plog = "click the login button";
		flog = "Unable to click the login button";
		ClickElement(".//*[@id='btnLogin']");
		
		
		MouseOverElement("//b[text()='Leave']");
		//click myleave button
		plog = "Able to click myleave button";
		flog = "unable to click myleave button";
		ClickElement("//a[@id='menu_leave_viewMyLeaveList']");
		
		//set fromdate
		plog = "Able to set fromdate";
		flog = "unable to set fromdate";
		SetText("//input[@id='calFromDate']", getData("Fromdate"));
		wait(2);
		ClickElement(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img");
		//set todate
		plog = "Able to set todate";
		flog = "unable to set todate";
		wait(5);
		ClearElement("//input[@id='calToDate']");
		wait(2);
		
		SetText("//input[@id='calToDate']", getData("Todate"));
		
		plog = "Able to uncheck the all checkbox";
		flog = "unable to uncheck the all chechbox";
		ClickElement(".//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck'] and checked='checked'");
		
		//check pending approvals checkbox
		plog = "Able to click chechbox";
		flog = "unable to click chechbox";
		ClickElement("//input[@id='leaveList_chkSearchFilter_1']");
		
		//click search button
		plog = "Able to click Search button";
		flog = "unable to click Search button";
		ClickElement("//input[@id='btnSearch']");
		
		//click save button
		plog = "Able to click Save button";
		flog = "unable to click Save button";
		ClickElement("//input[@id='btnSave']");

	}
	
	
	public static void verify_user_entitlements()
	{
		Userlogin login = new Userlogin();
		login.user_login(getData("URL"), getData("Username"), getData("Password"));
		
		enableTakingScreenshots();
		enableHighlight();
		SetImplicitWait(10);
		
		MouseOverElement("//a[@id='menu_leave_viewLeaveModule']");
		plog = "able to click on Entitlements";
		flog = "unable to click on entitlements";
		MouseOverElement("//a[@id='menu_leave_Entitlements']");
		ClickElement("//a[@id='menu_leave_viewMyLeaveEntitlements']");
		wait(4);
	
		plog = "leave type is selected";
		flog = "unable to select leavetype";
		SelectOPtionByText(".//*[@id='entitlements_leave_type']", getData("Option"));
		
		plog = "leave period is selected";
		flog = "unable to select leave period";
		SelectOPtionByText(".//*[@id='period']", getData("Period"));
		
		plog = "search button is clicked";
		flog = "unable to click search button";
		wait(5);
		ClickElement("//input[@name='_search']");
		
		
		
	}
	
	public static void leave_reports()
	{
		Userlogin login = new Userlogin();
		login.user_login(getData("URL"), getData("Username"), getData("Password"));
		
		enableTakingScreenshots();
		enableHighlight();
		SetImplicitWait(10);
		
		MouseOverElement("//a[@id='menu_leave_viewLeaveModule']");
		plog = "able to click on Entitlements";
		flog = "unable to click on entitlements";
		MouseOverElement("//a[@id='menu_leave_Reports']");
		ClickElement("//a[@id='menu_leave_viewMyLeaveBalanceReport']");
		wait(4);
		
		plog = "date ie selected";
		flog = "date is not selected";
		SelectOPtionByText(".//*[@id='period']", getData("Fromdate"));
		
		plog = "view button is clicked";
		flog = "view button is not clicked";
		ClickElement("//input[@id='viewBtn']");
		
	}
	
	

}
