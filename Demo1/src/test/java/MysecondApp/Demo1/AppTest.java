package MysecondApp.Demo1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    public WebDriver driver;
    @Test
    public void g()
    {
    	Assert.assertTrue(true);
    }
    
    @Test
    public void LaunchEdge()
    {
    	driver = new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    }
}
