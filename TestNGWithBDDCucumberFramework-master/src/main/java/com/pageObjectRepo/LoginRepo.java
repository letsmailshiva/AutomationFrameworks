package com.pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginRepo {
	
	//private variable for encapsulation achieve
	//we handling by using public getter setter method
	
	@FindBy(id = "Email")
	@CacheLookup// this is use for webElement never change 
	private WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup// this is use for webElement never change 
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup// this is use for webElement never change 
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup// this is use for webElement never change 
	private WebElement clickOnSubmit;
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	@CacheLookup// this is use for webElement never change 
	private WebElement titleHomepage;
	
	
	
	
	
	
	
	
	
	@FindBy(id = "Password")
	@CacheLookup
	private WebElement txtPassword;
	
	//__________________________________________
	
	
	//public variable
	
	@FindBy(xpath  = "//button[text()='Log in']")
	public WebElement btnLogin;
	
	@FindBy(xpath  = "//a[text()='Logout']")
	public WebElement btnLogout;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}
	
	
	

}
