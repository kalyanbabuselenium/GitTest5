package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo1
{
	@Test
	public void radioButtonDemoTest()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement RadioButton = driver.findElement(By.xpath("//input[@name='tripType'and@value='oneway']"));
        boolean expectecdOneWayRadioButtonIsDisplayed=true;
        boolean actualOneWayRadioButtonIsDisplayed = RadioButton.isDisplayed();
        
        Assert.assertEquals(actualOneWayRadioButtonIsDisplayed, expectecdOneWayRadioButtonIsDisplayed);

        
        boolean expectecdOneWayRadioButtonIsEnabled=true;
        boolean actualOneWayRadioButtonIsEnabled = RadioButton.isDisplayed();
        
        Assert.assertEquals(actualOneWayRadioButtonIsEnabled, expectecdOneWayRadioButtonIsEnabled);

        
        boolean expectecdOneWayRadioButtonIsSelectedBeforeClick=false;
        boolean actualOneWayRadioButtonIsSelectedBeforeClick = RadioButton.isSelected();
        
        Assert.assertEquals(actualOneWayRadioButtonIsSelectedBeforeClick, expectecdOneWayRadioButtonIsSelectedBeforeClick);

        
        RadioButton.click();
        boolean expectecdOneWayRadioButtonIsSelectedAfterClick=true;
        boolean actualOneWayRadioButtonIsAfterSelectedAfterClick = RadioButton.isDisplayed();
        
        Assert.assertEquals(actualOneWayRadioButtonIsAfterSelectedAfterClick, expectecdOneWayRadioButtonIsSelectedAfterClick);

        
	
	}

}
