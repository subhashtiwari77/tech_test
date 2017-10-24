package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exoHome {
	WebDriver driver;
	public exoHome(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void gotoHome(){
		driver.get("https://www.exonar.com/");
	}
	
	@FindBy(xpath="./html/body/div[2]/header/div[1]/div/div/nav/div/ul/li[5]/a/span[2]")
	private WebElement newsLink;
	public void clickNewsLink(){
		newsLink.click();
	}
	
	
}
