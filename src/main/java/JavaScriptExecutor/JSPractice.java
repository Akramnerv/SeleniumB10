package JavaScriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUnits;

public class JSPractice {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techtorialacademy.com/");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String title = javascriptExecutor.executeScript("return document.title").toString();

        System.out.println(title);

        WebElement browseCourse = driver.findElement(By.linkText("Browse Course"));
        javascriptExecutor.executeScript("arguments[0].click()",browseCourse);

        WebElement copyRight = driver.findElement(By.xpath("//p[contains(text(),'Copyrights')]"));
        BrowserUnits.scrollToView(driver, copyRight);

        WebElement loginButton = driver.findElement(By.xpath("(//a[.='Student login'])[2]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",loginButton);


    }
}
