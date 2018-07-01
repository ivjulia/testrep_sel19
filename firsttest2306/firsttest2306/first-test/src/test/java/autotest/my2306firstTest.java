package autotest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class my2306firstTest {

    private WebDriver driver;
    private WebDriverWait wait;


@Before
    public void start()  {
        driver = new InternetExplorerDriver();
        wait = new WebDriverWait (driver, 10);
    }

@Test
    public void  my2306firstTest() {
        driver.navigate().to("https://mail.ru/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        //driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver  - Поиск Mail.Ru"));
    }


@After
    public void stop()
    {

        driver.quit();
        driver = null;

    }

}


