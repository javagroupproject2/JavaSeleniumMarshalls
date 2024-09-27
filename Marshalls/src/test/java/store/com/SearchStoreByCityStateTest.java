/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package store.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class SearchStoreByCityStateTest {

    private WebDriver driver;

    public SearchStoreByCityStateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testSearchStoreByCityStateDirections() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.linkText("Stores")).click();
        driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
        driver.findElement(By.id("store-location-city")).click();
        driver.findElement(By.id("store-location-city")).clear();
        driver.findElement(By.id("store-location-city")).sendKeys("Schaumburg");
        driver.findElement(By.id("store-location-state")).click();
        new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Illinois");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//div[@id='main']/div[3]/section/div[2]/section/section/ul/li[2]/a")).click();
        driver.get("https://www.marshalls.com/us/store/stores/Schaumburg-IL-60173/544/aboutstore");
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("233");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("233 Coventry");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("Vernon Hills");
        driver.findElement(By.id("zip")).click();
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("60061");
        driver.findElement(By.id("state")).click();
        new Select(driver.findElement(By.id("state"))).selectByVisibleText("Illinois");
        driver.findElement(By.id("directions-submit")).click();

        driver.close();

    }
}
