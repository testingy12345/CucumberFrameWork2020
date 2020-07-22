package org.fb.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yuvarajnandhak@gmail.com");
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
	@Given("Launching the flipkard website")
	public void launching_the_flipkard_website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome Driver is initialized");
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart app is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		System.out.println("Quit the Browser");
	    
	}
	@Given("User Launches SnapDeal Website")
	public void user_Launches_SnapDeal_Website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome Driver is initialized");
		Thread.sleep(2000);
		driver.get("https://www.snapdeal.com/");
		System.out.println("SnapDeal app is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		System.out.println("Quit the Browser");
	    
	}
	@Then("User enter Username {string} and Password {string}")
	public void user_enter_Username_and_Password(String uname, String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		
	    
	}
	
	@Given("User Launches SnapDeal Website in firefox")
	public void user_Launches_SnapDeal_Website_in_firefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Firefox Driver is initialized");
		Thread.sleep(2000);
		driver.get("https://www.snapdeal.com/");
		System.out.println("SnapDeal app is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		System.out.println("Quit the Browser");
	    	}
	@Given("User Launches Amazon Webisite in firefox")
	public void user_Launches_Amazon_Webisite_in_firefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Firefox Driver is initialized");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		System.out.println("amazon website is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		System.out.println("Quit the Browser");
	    
	}






}
