package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.Login_Page;

public class Login_test extends BaseClass {
		Login_Page login;
			
			@BeforeMethod
			public void SetUp() throws IOException 
			{
				LaunchTheWeb();
				login= new Login_Page();
				
				
			}
			
			@AfterMethod
			public void tearDown()
			
			{
				driver.quit();
			}
			
			@Test
			public void LoginWithValidCredential()
			{
				
				login.setInputusername(login.getUsername());
				login.setInputpassword(login.getPassword());
				login.ClickOnLoginButton();
			}
}
