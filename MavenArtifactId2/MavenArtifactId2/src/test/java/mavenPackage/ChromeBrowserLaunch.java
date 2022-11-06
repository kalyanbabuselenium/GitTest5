package mavenPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserLaunch 
{
	@Test
	public void chrometest()
	{
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://gmail.com");//driver.get("https://www.facebook.com/");
	driver.findElement(By.id("identifierId")).sendKeys("RBG technologies");
	
}
}
