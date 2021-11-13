package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class BrowserUnits {
    public static void switchByTitle(WebDriver driver, String title){
        Set<String> ids = driver.getWindowHandles();
        for(String id: ids){
            driver.switchTo().window(id);
            if(driver.getTitle().contains(title)){
                break;
            }
        }
    }
    public static void closeWindowByTitle(WebDriver driver, String title){
        Set<String> ids = driver.getWindowHandles();
        for(String id: ids){
            driver.switchTo().window(id);
            if(!driver.getTitle().equals(title)){
                driver.close();
            }
        }
    }
    public static void scrollToView(WebDriver driver, WebElement element){
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
}
