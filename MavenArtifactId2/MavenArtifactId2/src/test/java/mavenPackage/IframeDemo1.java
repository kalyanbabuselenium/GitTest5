package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeDemo1 
{
     @Test
	public void iframeDemo1()
	{
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
 		 WebDriver driver=new ChromeDriver();
 		 driver.manage().window().maximize();
         driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
         String expectediframeDemo1Data="Saturday, 3 January 2015";
         driver.switchTo().frame(0);
        
         String actualiframeDemo1Data=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText();
         Assert.assertEquals(actualiframeDemo1Data, expectediframeDemo1Data);
         System.out.println("iframeDemo1 assertEquals is Done");
         driver.switchTo().defaultContent();
         driver.findElement(By.xpath("//input[@name='Town']")).sendKeys("praveen");
         
	}

}
