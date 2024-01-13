package TestLayer;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import BaseLayer.Baseclass;
import PageLayer.Registrationpage;

public class RegisterPageTest extends Baseclass{
	
	@BeforeTest
	public void setup()
	{
		Baseclass.intialize();
		
	}
	@Test
	public void validateRegistrationpage()
	{
		Registrationpage register=new Registrationpage();
		
		
				
	register.registrationfunctionalitypage("vijayshri","pawar", "9874563215", "abc@gmail.com", "kalamb","pune", "Maharashtra"
						,"411034","ANGOLA","priyanka123", "12345678","1235678");
		
		
	}
	@AfterTest
	public void teradown()
	{
		//driver.quit();
	}

}
