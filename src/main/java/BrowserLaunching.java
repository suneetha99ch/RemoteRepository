import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserLaunching
{
@Test
public void funA()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vchanda\\Desktop\\Selenium Folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(opt);
driver.get("https://github.com/testng-team/testng");
System.out.println("yes");
}
}
