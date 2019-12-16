import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class s4eeClass {
        @Test
        public void testTitle()throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://s4e.com.ua/index.php?route=account/simpleregister");

            driver.manage().window().maximize();


            System.out.println(driver.getTitle());


            driver.findElement(By.id("register_email")).sendKeys("terapiya@meta.ua");
            Thread.sleep(3000);
            driver.findElement(By.id("register_password")).sendKeys("98765");
            Thread.sleep(3000);
            driver.findElement(By.id("register_confirm_password")).sendKeys("98765");
            Thread.sleep(3000);
            driver.findElement(By.id("register_firstname")).sendKeys("Lolik");
            Thread.sleep(3000);
            driver.findElement(By.id("register_lastname")).sendKeys("Shumorik");
            Thread.sleep(3000);
            driver.findElement(By.id("register_telephone")).sendKeys("9882221002");
            driver.findElement(By.id("register_address_1")).sendKeys("Gogolya 22/28");
            driver.findElement(By.id("register_field20")).sendKeys("10.07.1988");
            Thread.sleep(4000);
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div/div[3]/div/a/span")).click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)", "");

            Assert.assertNotNull(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/h1")));
            System.out.println("Register - Done");

            driver.close();
        }
    }
