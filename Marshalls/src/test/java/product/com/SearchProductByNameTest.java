/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package product.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class SearchProductByNameTest {

    private WebDriver driver;

    public SearchProductByNameTest() {
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
    public void testSearchProductByName() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=marshalls&rlz=1C1ONGR_enUS1113US1114&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMhIIBxAuGCcYrwEYxwEY6gIYjgXSAQkyMjA3ajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.id("search-text-input")).click();
        driver.findElement(By.id("search-text-input")).clear();
        driver.findElement(By.id("search-text-input")).sendKeys("shoes");
        driver.findElement(By.id("site-search-form")).submit();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.get("https://www.marshalls.com/us/store/shop/shoes/_/N-696105375?searchTerm=shoes");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
        driver.findElement(By.xpath("//div[@id='style-4000306046']/div/div/a/img[2]")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/shoes/Willis-Western-Chelsea-Boots/4000306046?colorId=NS4155730&pos=1:11&N=696105375");

        driver.close();

    }
}
