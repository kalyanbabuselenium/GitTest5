package mavenPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopWindoDemo1
{
    @Test
	public void popWindoTest()
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.guru99.com/popup.php");
	  // driver.switchTo().frame(0);
	   WebElement popWindow = driver.findElement(By.xpath("//a[text()='Click Here']"));
	   popWindow.click();
	   Set<String> windowsIDs =  driver.getWindowHandles();
	   Iterator<String> windowsIDList=windowsIDs.iterator();
	   String parentWindowId=windowsIDList.next();
	   String ChildWindowId=windowsIDList.next();
       driver.switchTo().window(ChildWindowId);
	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("karetipravenn108@gmail.com");
	   
	    
	}
}
