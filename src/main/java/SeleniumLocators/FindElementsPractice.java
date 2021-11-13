package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.findElement() -- one element -- webelement
        //driver.findElements() -- all matching elements -- list of webelement



        driver.navigate().to("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.xpath("//li/a"));
int count = 0;
        for (WebElement element : links) {
            if (element.getText().length()<12) {

                System.out.println(element.getText());
                System.out.println(element.getAttribute("href"));
            count++;}
        }

        System.out.println(count);
    }
}
