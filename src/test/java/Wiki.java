import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wiki {

    @Test
    public void testWikiWait(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        // Implicit dvs all väntan på alla element ändra
//        System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
        // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        // driver.findElement(By.name("search")).sendKeys("Einstein");
        waitkMethod(driver,"[name='search']").sendKeys("Einstein");
        // Implicit Wait
        // driver.findElement(By.cssSelector("#v-1-1")).click();

        // Explicit Wait
        //clickMethod(driver,"#v-1-1");
        waitkMethod(driver,"#v-1-1").click();

        //Tamara
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.
                presenceOfElementLocated(By.id("v-1-1")));
        // element.click();

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#v-1-1"))));
//        element.click();
    }

    private void clickMethod(WebDriver driver,String selector){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(selector))));
        element.click();
    }

    private WebElement waitkMethod(WebDriver driver,String selecor){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selecor)));
    }


}
