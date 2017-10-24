package stepDefinitions;

import static org.junit.Assert.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.QALeadJobReq;
import pages.exoHome;
import pages.exoNews;

public class test {
	WebDriver driver;
	exoHome home;
	exoNews news;
	QALeadJobReq jobreq;
	
	@Given("^user navigates to News page of the website$")
	public void user_navigates_to_News_page_of_the_website() throws Throwable{
		System.setProperty("webdriver.chrome.driver","src\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		home = new exoHome(driver);
		
		home.gotoHome();
		Thread.sleep(5000);
		home.clickNewsLink();
	}
	
	@When("^user click on the QA Lead job requirement page$")
	public void user_click_on_the_QA_Lead_job_requirement_page() throws Throwable{
		news=new exoNews(driver);
		System.out.println("First check");
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		news.clickScrollDown();
		Thread.sleep(7000);
		news.clickQAVacancy();
		
	}
	
	@Then("^the number of Key Responsibilities is equal to \"([^\"]*)\"$")
	public void the_number_of_Key_Responsibilities_is_equal_to(int expectedResposibilities) throws Throwable{
		Thread.sleep(5000);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,400)", "");
		jobreq = new QALeadJobReq(driver);
		System.out.println("Actual Number of Responsibilities are "+ jobreq.actualResponsCount());
		assertEquals("number of Responsibilites doesn't match", jobreq.actualResponsCount(),expectedResposibilities);
	}
	
	@Then("^the number of Requirements is equal to \"([^\"]*)\"$")
	public void the_number_of_Requirements_is_equal_to(int expectedRequirements) throws Throwable{
		Thread.sleep(5000);
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,250)", "");
		jobreq.actualRequirCount();
		System.out.println("Actual Number of Requirements are "+ jobreq.actualRequirCount());
		assertEquals("number of requirement doesn't match", jobreq.actualRequirCount(),expectedRequirements);
	}
		
	
	@After()
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}
