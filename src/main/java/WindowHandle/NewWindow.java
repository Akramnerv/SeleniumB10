package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;
import org.testng.annotations.Test;
import utils.BrowserUnits;

import java.util.Set;

public class NewWindow {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        String mainTitle= driver.getTitle();
        WebElement clickHere = driver.findElement(By.xpath("//a[.=\'Click Here\']"));
        clickHere.click();

        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");

        /*String mainWindowID = driver.getWindowHandle(); //123*/
        BrowserUnits.switchByTitle(driver, "About Us");
        System.out.println(driver.getTitle());

        BrowserUnits.closeWindowByTitle(driver, mainTitle);



    }



    }
