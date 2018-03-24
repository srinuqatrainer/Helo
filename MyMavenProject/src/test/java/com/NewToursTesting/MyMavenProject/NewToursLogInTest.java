package com.NewToursTesting.MyMavenProject;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewToursLogInTest
{
	@Test
	public void LogIn()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:///newtours.demoaut.com");
	}
}
