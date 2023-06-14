package Tests;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingFlightTicketPage
{
	WebDriver driver;

	@Test
	public void loginSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchanda\\Desktop\\Selenium Folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched successfully");	
	}
	public void handleLightBox(String lightxpath)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("notification-frame-173061b02");
		WebElement lightbox = driver.findElement(By.xpath("//a[@class='"+lightxpath+"']"));
		lightbox.click();
		driver.switchTo().defaultContent();
		System.out.println("lightbox handled successfully");	
	}

	public void clickOnOneWay(String radiobutton) 
	{
		//ul[@class="fswTabs latoRegular darkGreyText "]/li[text()='One Way']
		WebElement oneWay = driver.findElement(By.xpath("//ul[@class=\"fswTabs latoRegular darkGreyText \"]/li[text()='"+radiobutton+"']"));
		oneWay.click();
		System.out.println("One way is clicked successfully");	   
	}
	public void clickOnFrom(String fromaddress)
	{
		WebElement from = driver.findElement(By.xpath("//span[text()='"+fromaddress+"']"));
		from.click();
		System.out.println("clciked on from");	  
		//span[text()='From']//input[@placeholder="From"]
	}
	public void EneterHyderabad(String placeholder, String cityname)
	{
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='"+placeholder+"']"));
		enter.sendKeys(cityname);
		System.out.println("Enetered Hyderabad");	 
	}
	public void selectFirstCity(String index)
	{
		//li[@id='react-autowhatever-1-section-0-item-1']
		WebElement firstcity = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-"+index+"']"));
		firstcity.click();
//		for(int i=0;i<firstcity.size();i++)
//		{
//			firstcity.get(i).click()
//		}
//		   
		
		System.out.println("selected first city");	 		
	}
	public void toAddress(String toaddress)
	{
		WebElement from = driver.findElement(By.xpath("//span[text()='"+toaddress+"']"));
		from.click();
		System.out.println("clciked on to");	
		
		//span[text()='From']//input[@placeholder="From"]
	}
	public void EneterMumbai(String placeholder, String cityname)
	{
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='"+placeholder+"']"));
		enter.sendKeys(cityname);
		System.out.println("Enetered Mumbai");	 
	}
	public void selectFirstcityinToAddress(String index)
	{
		WebElement firstcity = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-"+index+"']"));
		firstcity.click();
		System.out.println("selected first city");	 		
	}
	//Departure
	public void departureDate(String date, String Dateofdeparture)
	{
		WebElement dptcolumn = driver.findElement(By.xpath("//span[text()='"+date+"']"));
		dptcolumn.click();
		System.out.println("clciked on Departure");	
		//div[@aria-label="Thu Jun 15 2023" and @aria-disabled="false"]/div/p[text()='15']
		//div[contains(@aria-label,'Jul 15')]Jul 15
//		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		WebElement dptDate = driver.findElement(By.xpath("//div[contains(@aria-label,'"+Dateofdeparture+"')]"));
//		jsc.executeScript("arguments[0].click();", dptDate);
		Actions act = new Actions(driver);
		act.doubleClick(dptDate).perform();
		System.out.println("Departure date is selected successfully");	 			
	}
	//ADULTS (12y +)
	//p[text()='ADULTS (12y +)']/following-sibling::ul[@class='guestCounter font12 darkText gbCounter']/li[text()='5']
	//Travellers & ClassADULTS (12y +)CHILDREN (2y - 12y )INFANTS (below 2y)
	//p[text()='ADULTS (12y +)']/following-sibling::ul[@class="guestCounter font12 darkText gbCounter"]/li
	public void clickOnTrvellers(String tavellerscolumn)
	{
		WebElement trvcolumn = driver.findElement(By.xpath("//span[text()='"+tavellerscolumn+"']"));
		trvcolumn.click();
		System.out.println("Trvellers is clicked successfully");		
		
	}
	public void Trvellers(String category, String count)
	{
		WebElement adultscount = driver.findElement(By.xpath("//p[text()='"+category+"']/following-sibling::ul[@class='guestCounter font12 darkText gbCounter']/li[text()='"+count+"']"));
		adultscount.click();	
		System.out.println("Trvellers is selected successfully");					
	}
	public void applyButton(String applybutton)
	{
		JavascriptExecutor JSC = (JavascriptExecutor)driver;
		WebElement applyButton = driver.findElement(By.xpath("//button[text()='"+applybutton+"']"));
		JSC.executeScript("arguments[0].click();", applyButton);
//		applyButton.click();	
		System.out.println("apply button is selected successfully");				
	}
	//a[text()='Search']
	public void clickOnsearchButton(String searchbutton)
	{
		//JavascriptExecutor JSC = (JavascriptExecutor)driver;
		WebElement searchButton = driver.findElement(By.xpath("//a[text()='"+searchbutton+"']"));
		//JSC.executeScript("arguments[0].click();", applyButton);
		searchButton.click();	
		System.out.println("search button is clicked successfully");				
	}
	public void concatinateallthetext()
	{
		WebElement firstText = driver.findElement(By.xpath("//div[@class='listingRhs']/p"));	
		String actualText = firstText.getText();
		System.out.println(actualText);
		String expectedText = "Flights from Hyderabad to Mumbai";
		if(actualText.equals(expectedText))
		{
			Assert.assertEquals(actualText, "Flights from Hyderabad to Mumbai");
			System.out.println("text is matching with the expected");
		}
		else
		{
			System.out.println("text is matching with the expected");
		}
	}
	public void handlelightbox()
	{
		//div[@class="commonOverlay "]/span
		WebElement lightboxagain = driver.findElement(By.xpath("//div[@class=\"commonOverlay \"]/span"));
		lightboxagain.click();
		System.out.println("handlelightbox successfully");
	}
	public void clcikONViewFlightDetails(String indexflight)
	{
		//(//div[@class='makeFlex spaceBtwCenter fontSize12 card-footer-v2'])[1]/span[text()='View Flight Details']
		//(//div[@class='makeFlex spaceBtwCenter fontSize12 card-footer-v2'])[1]/span[text()='View Flight Details']
	WebElement firstFlightDetails = driver.findElement(By.xpath("(//div[@class='makeFlex spaceBtwCenter fontSize12 card-footer-v2'])["+indexflight+"]/span[text()='View Flight Details']"));
	firstFlightDetails.click();
	System.out.println("view detail page is opened successfully");
	}
}
