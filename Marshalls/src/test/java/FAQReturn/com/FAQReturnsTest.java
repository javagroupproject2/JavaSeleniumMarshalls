/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package FAQReturn.com;

import org.openqa.selenium.Alert;
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
public class FAQReturnsTest {
     private WebDriver driver;
    public FAQReturnsTest() {
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
    public void testFAQReturns() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.marshalls.com/us/store/index.jsp");
        driver.findElement(By.linkText("FAQs")).click();
        driver.get("https://www.marshalls.com/us/store/jump/topic/FAQs/22200018p");
        driver.findElement(By.xpath("//div[@id='main']/div[2]/section/div/div/div/a[4]")).click();
        driver.findElement(By.id("accordion-header-19")).click();
        driver.findElement(By.xpath("//dd[@id='accordion-panel-19']/ul/li[5]/a/strong")).click();
        driver.get("https://www.marshalls.com/us/store/jump/topic/Contact-Us/3200004");
        driver.findElement(By.linkText("Chat With Us")).click();
         driver.close(); 
        
        
    } 
    
    
}
