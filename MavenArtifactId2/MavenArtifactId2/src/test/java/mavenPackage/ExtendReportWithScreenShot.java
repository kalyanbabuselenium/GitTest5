package mavenPackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtendReportWithScreenShot 
{
public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest extentLoggerECP;
public static  ExtentTest parentExtentLogger;


	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Batch27\\MavenArtifactId2\\MavenArtifactId2\\webDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    

	    TakesScreenshot scrShot =((TakesScreenshot)driver);
	    File SrcFile1=scrShot.getScreenshotAs(OutputType.FILE);
	    File DestFile1=new File("C:\\Users\\admin\\Desktop\\SreanShot\\praveen.png");
	    FileUtils.copyFile(SrcFile1, DestFile1);
	    
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\admin\\Desktop\\FrameWork Demo\\Extend Reports\\test4.html");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		extentLoggerECP = parentExtentLogger.createNode("Senario1");
		extentLoggerECP.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		extentLoggerECP.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\admin\\Desktop\\SreanShot\\praveen.png").build());
		extent.flush();
		System.out.println("Done");
		
	


		
	}

}
