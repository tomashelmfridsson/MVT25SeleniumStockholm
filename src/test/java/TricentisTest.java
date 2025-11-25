import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TricentisTest {
    @Test
    public void tricentisOpenTest(){
        WebDriver driver = new ChromeDriver();
        // Open web browser
        driver.get("https://demowebshop.tricentis.com/");
        assertEquals("Demo Web Shop",driver.getTitle());
        driver.quit();
    }
}
