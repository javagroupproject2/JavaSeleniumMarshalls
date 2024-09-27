/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package rewards.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class RewardsTest {

    private WebDriver driver;

    public RewardsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testRewards() throws Exception {
        driver.get("https://www.google.com/search?q=marshalls&rlz=1C1ONGR_enUS1113US1114&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMhIIBxAuGCcYrwEYxwEY6gIYjgXSAQg4MTNqMGoxNagCCLACAQ&sourceid=chrome&ie=UTF-8");
        //Maximize browser window   
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.xpath("//div[@id='site-wrapper']/header/div/div/div[2]/nav/ul/li[3]/div/a/span")).click();
        driver.findElement(By.linkText("Learn More & Apply")).click();
        driver.get("https://www.marshalls.com/us/store/jump/topic/TJX-Rewards-Credit-Card/2400012");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.close();
    }

}
