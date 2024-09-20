package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteClass implements WebElement{
	
	
	@Test
	public void executeDesired() throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		System.setProperty("WebDriver.chrome.driver","../MNP_USA/Drivers/Chrome/chromedriver.exe");
		@SuppressWarnings("deprecation")
		RemoteWebDriver rdriver = new ChromeDriver(capabilities);
		
		
		rdriver.get("https://www.guru99.com/ssl-certificate-error-handling-selenium.html");
		
		Thread.sleep(5000);
		
		rdriver.close();
				
	}
	
	@Test
	public void executeDesiredFireFox() throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.gecko.driver","../MNP_USA/Drivers/Firefox/geckodriver.exe");
		@SuppressWarnings("deprecation")
		RemoteWebDriver rdriver = new FirefoxDriver(capabilities);
		
		rdriver.get("https://www.guru99.com/ssl-certificate-error-handling-selenium.html");
		
		Thread.sleep(5000);
		
		rdriver.close();
				
	}
	
	
	@Test
	public void executeDesiredEIE() throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver","../MNP_USA/Drivers/IE/IEDriverServer.exe");
		@SuppressWarnings("deprecation")
		RemoteWebDriver rdriver = new InternetExplorerDriver(capabilities);
		
		rdriver.get("https://www.guru99.com/ssl-certificate-error-handling-selenium.html");
		
		Thread.sleep(5000);
		
		rdriver.close();
				
	}
/////////////////////////////////////////////////////////////////
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void click() {
		// TODO Auto-generated method stub
		
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		
	}

	public void submit() {
		// TODO Auto-generated method stub
		
	}

	////////////////////////////////////////////
}
