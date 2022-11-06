package mavenPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo3 
{
	@Test
	public void checkBoxTest3()
	{

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
        
        WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        
        boolean expectecdCheckBoxIsDisplayed=true;
        boolean actualCheckBoxIsDisplayed = checkBox.isDisplayed();
        System.out.println("actualCheckBoxIsDisplayed: "+actualCheckBoxIsDisplayed);
        
        Assert.assertEquals(actualCheckBoxIsDisplayed, expectecdCheckBoxIsDisplayed);
        
        boolean expectecdCheckBoxIsEnabled=true;
        boolean actualCheckBoxIsEnabled = checkBox.isDisplayed();
        
        Assert.assertEquals(actualCheckBoxIsEnabled, expectecdCheckBoxIsEnabled);
        
        boolean expectecdCheckBoxIsSelectedBeforeClick=false;
        boolean actualCheckBoxIsSelectedBeforeClick = checkBox.isSelected();
        
        Assert.assertEquals(actualCheckBoxIsSelectedBeforeClick, expectecdCheckBoxIsSelectedBeforeClick);
        
        
        checkBox.click();
        boolean expectecdCheckBoxIsSelectedAfterClick=true;
        boolean actualCheckBoxIsAfterSelectedAfterClick = checkBox.isSelected();
        
        Assert.assertEquals(actualCheckBoxIsAfterSelectedAfterClick, expectecdCheckBoxIsSelectedAfterClick);
        driver.quit();

	
	}

}
