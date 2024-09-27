/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package store.com;

import org.openqa.selenium.By;
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
public class SearchStoreByZipCodeTest {
     private WebDriver driver;
    public SearchStoreByZipCodeTest() {
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
    public void testSearchStoreByZipCode() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.linkText("Stores")).click();
        driver.get("https://www.marshalls.com/us/store/stores/storeLocator.jsp");
        driver.findElement(By.id("store-location-zip")).click();
        driver.findElement(By.id("store-location-zip")).clear();
        driver.findElement(By.id("store-location-zip")).sendKeys("60061");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("Store Info and Directions")).click();
        driver.get("https://www.marshalls.com/us/store/stores/Buffalo+Grove-IL-60089/1303/aboutstore");
   driver.close();
    
    }
      
}
