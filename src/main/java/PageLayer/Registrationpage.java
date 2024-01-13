package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public   class Registrationpage  extends Baseclass{
	
	
	@FindBy(name="firstName")
	private WebElement Name;
	
	
	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="phone")
	private WebElement mob;

	
	@FindBy(name="userName")
	private WebElement email;

	
	@FindBy(name="address1")
	private WebElement ad;

	
	@FindBy(name="city")
	private WebElement City;

	@FindBy(name="state")
	private WebElement state;

	
	@FindBy(name="postalCode")
	private WebElement pcode;

	
	@FindBy(name="country")
	private WebElement country;

	
	@FindBy(name="email")
	private WebElement uname;

	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="confirmPassword")
	private WebElement cpass;

 public Registrationpage()
 {
	 PageFactory.initElements(driver, this);
 }
 public void registrationfunctionalitypage(String firstname,String lastname,String phone,
		 String Email,String address,String Cit,String State,String pincode,String Country,String username,String password
		 
		 ,String confirnpass)
 {
	 
	 Name.sendKeys(firstname);
	 
	 lName.sendKeys(lastname);
	 
	 mob.sendKeys(phone);
	 
	 ad.sendKeys(address);
	 
	 City.sendKeys(Cit);
	 
	 state.sendKeys(State);
	 
	 pcode.sendKeys(pincode);
	 
	 country.sendKeys(Country);
	
	 uname.sendKeys(username);
	 
	 pass.sendKeys(password);
	 
	 cpass.sendKeys(confirnpass);
	 
 }

	
}


