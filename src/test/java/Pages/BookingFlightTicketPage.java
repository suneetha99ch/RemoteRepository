package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookingFlightTicketPage
{
	
	
public void loginSetup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchanda\\Desktop\\Selenium Folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.makemytrip.com/");
	System.out.println("Browser Launched successfully");	
}
}
