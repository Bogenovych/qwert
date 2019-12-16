import com.google.common.base.Verify;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class s4eClass {



    @Test
        public void testTitle()throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            Actions actions = new Actions(driver);

        driver.get("https://s4e.com.ua/index.php?route=account/simpleregister");

        driver.manage().window().maximize();
            System.out.println(driver.getTitle());


        driver.findElement(By.id("register_email")).sendKeys("tratbbd@mea.ew");
        Thread.sleep(3000);
        driver.findElement(By.id("register_password")).sendKeys("tratdq");
        Thread.sleep(3000);
        driver.findElement(By.id("register_confirm_password")).sendKeys("tratdq");
        Thread.sleep(3000);
        driver.findElement(By.id("register_firstname")).sendKeys("senyddddq");
        Thread.sleep(3000);
        driver.findElement(By.id("register_lastname")).sendKeys("benyddddq");
        Thread.sleep(3000);
        driver.findElement(By.id("register_telephone")).sendKeys("9800949403");
        driver.findElement(By.id("register_address_1")).sendKeys("pishonovskay 31-a 1/28");
        driver.findElement(By.id("register_field20")).sendKeys("11.04.1991");



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");




        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[3]/div/a/span")).click();



        Verify.verifyNotNull(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/h1")));
        System.out.println("Register - Done");

        Thread.sleep(5000);

        driver.close();


        }
    }

