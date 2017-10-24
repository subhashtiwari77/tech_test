package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QALeadJobReq {
	WebDriver driver;
	public QALeadJobReq(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='main']/div/div/main/article/div[3]/div[1]/ul[1]/li[1]")
	private WebElement Responsibilities;
	
	public int actualResponsCount(){
		WebElement ul_Element = driver.findElement(By.xpath(".//*[@id='main']/div/div/main/article/div[3]/div[1]/ul[1]"));
		List<WebElement> li_All = ul_Element.findElements(By.tagName("li"));
		System.out.println(li_All.size());
		//List<WebElement> list1 = driver.findElements(By.xpath(".//*[@id='main']/div/div/main/article/div[3]/div[1]/ul[1]"));
		//int responsibilitiesCount = list1.size();
		return li_All.size();
	}
	
	public int actualRequirCount(){
		WebElement ul_Element = driver.findElement(By.xpath(".//*[@id='main']/div/div/main/article/div[3]/div[1]/ul[2]"));
		List<WebElement> li_All2 = ul_Element.findElements(By.tagName("li"));
		System.out.println(li_All2.size());
		//List<WebElement> list2 = driver.findElements(By.xpath(".//*[@id='main']/div/div/main/article/div[3]/div[1]/ul[2]/li[1]"));
		//int requirementsCount = list2.size();
		return li_All2.size();
	}
	
	
}
