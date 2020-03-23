package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SimpleRun {

    WebDriver driver = null;

    @BeforeTest
    public void initializer()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void Startup() throws IOException {
        driver.get("https://www.google.com/");
        System.out.println("this is simple class");
        System.out.println("this is simple class");

    }

}
