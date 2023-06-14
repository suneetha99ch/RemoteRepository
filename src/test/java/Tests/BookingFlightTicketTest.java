package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BookingFlightTicketTest 
{
	BookingFlightTicketPage book = new BookingFlightTicketPage();
	WebDriver driver;
	//   @Test
	//   public void browser()
	//   {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchanda\\Desktop\\Selenium Folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//	ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("--remote-allow-origins=*");
	//    driver = new ChromeDriver(opt);
	//    driver.manage().window().maximize();
	//   }


	@Test
	public void bookingATicket() throws InterruptedException 
	{
			book.loginSetup();
			book.handleLightBox("close");
			book.clickOnOneWay("One Way");
			book.clickOnFrom("From");
			book.EneterHyderabad("From", "Hyderabad");
			Thread.sleep(3000);
			book.selectFirstCity("0");
			Thread.sleep(3000);
			book.toAddress("To");
			book.EneterMumbai("To", "Mumbai");
			book.selectFirstcityinToAddress("0");
			book.departureDate("Departure","Jul 15");
			book.clickOnTrvellers("Travellers & Class");	
			book.Trvellers("ADULTS (12y +)","5");
			book.Trvellers("CHILDREN (2y - 12y )","5");
			book.Trvellers("INFANTS (below 2y)", "4");
			book.applyButton("APPLY");
			book.clickOnsearchButton("Search");
			Thread.sleep(4000);
			book.concatinateallthetext();
			book.handlelightbox();
			book.clcikONViewFlightDetails("2");
			
}
}
