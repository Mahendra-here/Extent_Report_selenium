package Extent.Report.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListSystem_login_page
{

	WebDriver driver; 
	 public String title1;
	 
	public ListSystem_login_page(WebDriver driver)  //page factory
	{    
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement Emailadress;
	
	public void Enteremailaddress()
	{
		Emailadress.sendKeys("chris@3csol.net");
	}
	
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	public void EnterPassword()
	{
		Password.sendKeys("teamwork");
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Clickbutton;
	
	public void applyBtn()
	{
		Clickbutton.click();
	}
	
	
	@FindBy(xpath = "//*[@id=\"navbarDropdown\"]")
	private WebElement Logout;
	
	public void Logoutuser()
	{
		Logout.click();
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div/div/a[2]")
	private WebElement ClickLogoutuser;
	
	public void ClickLogoutuser()
	{
		ClickLogoutuser.click();
	}
	
	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	private WebElement Contact;
	
	public void Contactclick() {
		Contact.click();
	}
}