/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package store.com;

import java.util.concurrent.TimeUnit;
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
public class SearchStoreByInvalidZipCodeTest {

    private WebDriver driver;

    public SearchStoreByInvalidZipCodeTest() {
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
    public void testUntitledTestCase() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=marshalls&rlz=1C1ONGR_enUS1113US1114&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMhIIBxAuGCcYrwEYxwEY6gIYjgXSAQkyMjA3ajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.linkText("Stores")).click();
        driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
        driver.findElement(By.id("store-location-zip")).click();
        driver.findElement(By.id("store-location-zip")).clear();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("store-location-zip")).sendKeys("012345");
        driver.findElement(By.id("findStoresForm")).submit();

        driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp?_requestid=3160763");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        // https://www.marshalls.com/us/store/stores/storeLocator.jsp?_requestid=3160763
        //driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/section/div[1]/p"));
        driver.close();

    }
}
