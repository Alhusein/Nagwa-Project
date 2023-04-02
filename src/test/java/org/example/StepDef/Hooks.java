package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    public static WebDriver driver;
    @Before
    public static void openBrowsre()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.nagwa.com/en/");

    }

    @After
    public static void closeBrowsre()
    {
        driver.quit();

    }

}
