package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exoNews {
	WebDriver driver;
	public exoNews(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a[1]/figure/div/div")
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a[1]/figure/figcaption/div/div")
	private WebElement QAVacancy;
	public void clickQAVacancy(){
		QAVacancy.click();
	}
	
	@FindBy(xpath=".//*[@id='av_section_1']/div[2]/a")
	private WebElement scrollDown;
	public void clickScrollDown(){
		scrollDown.click();
	}
}
