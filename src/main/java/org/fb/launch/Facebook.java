package org.fb.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	
	public static WebDriver driver;
	
	@Given("User Launches Chrome Browser")
	public void user_Launches_Chrome_Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome Driver is initialized");
		Thread.sleep(2000);
	  
	}

	@And("Verify the title")
	public void verify_the_title() {
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);
	    
	}

	@When("User Enters UserName")
	public void user_Enters_UserName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yuvarajnandhak@gmail.com");
		Thread.sleep(1000);

		
	    
	}

	@And("User Enters Password")
	public void user_Enters_Password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passwordone");
		Thread.sleep(1000);
	}

	@Then("User Click Submit Button")
	public void user_Click_Submit_Button() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("login button clicked");
		driver.quit();
		System.out.println("Quit the Browser");
	    
	}



}
