import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class MyDriverTest {

        private static WebDriver driver;

        @BeforeClass
        public static void bc() throws MalformedURLException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\irina\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com");
        }

        @Test
        public void test01_login() {
            driver.findElement(By.tagName("input")).click();
        }


        @AfterClass
        public static void ac() {
            driver.quit();
        }

    }
