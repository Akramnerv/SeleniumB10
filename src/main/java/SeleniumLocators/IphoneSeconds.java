package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneSeconds {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone13");
        //searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        WebElement result = driver.findElement(By.tagName("nobr"));
        String resultStr = result.getText().replaceAll("[^0-9.]","");
        double sec = Double.parseDouble(resultStr);

        if (sec<3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
