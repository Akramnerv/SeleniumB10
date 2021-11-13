package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframePractice {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement text = driver.findElement(By.id("tinymce"));

        text.clear();
        text.sendKeys("Hello JAva!");


        driver.switchTo().parentFrame();
        // parentFrame() goes one parent up in the inner html

        WebElement title = driver.findElement(By.tagName("h3"));
        String actualTitle = title.getText().trim();
        String expectedTitle = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
