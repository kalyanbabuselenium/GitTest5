package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DraganDropDemo1
{
	@Test
public void draganAndDrop()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	    driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    WebElement drage = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	    WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(drage, drop).perform();
	    
}
}
