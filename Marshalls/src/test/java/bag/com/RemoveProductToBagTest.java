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
public class RemoveProductToBagTest {
     private WebDriver driver;
    public RemoveProductToBagTest() {
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
  public void testRemoveProductToBag() throws Exception {
    driver.get("https://www.google.com/search?q=marshalls&rlz=1C1ONGR_enUS1113US1114&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMhIIBxAuGCcYrwEYxwEY6gIYjgXSAQkxMTcwajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://www.marshalls.com/us/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("shoes");
    driver.findElement(By.id("site-search-form")).submit();
    driver.get("https://www.marshalls.com/us/store/shop/shoes/_/N-696105375?searchTerm=shoes");
    driver.findElement(By.xpath("//div[@id='style-4000282960']/div/div/a/img[2]")).click();
    driver.get("https://www.marshalls.com/us/store/jump/product/shoes/Made-In-Portugal-Suede-Pamela-Wool-Lined-Boots/4000282960?colorId=NS4154978&pos=1:2&N=696105375");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.xpath("//div[@id='product-4000282960']/section/div[2]/form/div[3]/div/div[2]/ul/li/a/span")).click();
    driver.findElement(By.id("addItemToOrder")).click();
    
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    //driver.findElement(By.linkText("View Bag")).click();
    driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
     JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    driver.findElement(By.linkText("Remove")).click();
    //driver.findElement(By.linkText("Your Bag Is Empty")).click();
     //driver.get("https://www.marshalls.com/us/store/index.jsp");
    //driver.findElement(By.linkText("My Bag")).click();
    //driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    
  //driver.get("https://www.marshalls.com/us/store/checkout/cart.jsp");
    
    driver.close();
  }
}
