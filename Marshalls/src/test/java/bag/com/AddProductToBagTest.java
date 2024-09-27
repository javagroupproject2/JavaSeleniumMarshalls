/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package bag.com;

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
public class AddProductToBagTest {

    private WebDriver driver;

    public AddProductToBagTest() {
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
    public void testAddProductToBag() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=marshalls&rlz=1C1ONGR_enUS1113US1114&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMhIIBxAuGCcYrwEYxwEY6gIYjgXSAQg5NzVqMGoxNagCCLACAQ&sourceid=chrome&ie=UTF-8#cobssid=s");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.id("search-text-input")).click();
        driver.findElement(By.id("search-text-input")).clear();
        driver.findElement(By.id("search-text-input")).sendKeys("bags");
        driver.findElement(By.id("site-search-form")).submit();
        driver.get("https://www.marshalls.com/us/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=bags&qfh_sch=Search");
        driver.findElement(By.id("product-price-4000231329")).click();
        driver.get("https://www.marshalls.com/us/store/jump/product/Nylon-Motivator-Quilted-Sling-Bag/4000231329?colorId=NS4154916&pos=1:2&Ntt=bags");
        driver.findElement(By.id("addItemToOrder")).click();

        driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");

        driver.close();
    }

}
