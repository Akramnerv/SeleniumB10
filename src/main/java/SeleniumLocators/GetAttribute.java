package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("btnK"));
        String actualText = searchBox.getAttribute("value");
        String expectedText = "Google Search";
        //System.out.println(searchBox.getAttribute("q"));
        if(actualText.equals(expectedText)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
