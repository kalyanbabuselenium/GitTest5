package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsDemo1
{
	@Test
	public void locatorsDemoTest()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://gmail.com");//driver.get("https://www.facebook.com/");
		driver.findElement(By.id("identifierId")).sendKeys("RBG technologies");
		//Absalute X-path
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("RBG technologies2");
		//Relative X-path
		//SINGLE ATRIBUTE
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("RBG technologies3");
		//MULTIPLE ATRIBUTE
		driver.findElement(By.xpath("//input[@id='identifierId' and @name='identifier']")).sendKeys("RBG technologies4");
		
		
		
	
	}

}
