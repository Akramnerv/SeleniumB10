package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramePractice {

    @Test
    public void nesteddrameValidation (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(0);//frame top
        WebElement middleFrame = driver.findElement(By.name("frame-middle"));
        //we shoud find the webelement by name of thhe middle frame
        driver.switchTo().frame(middleFrame); // frame middle

        WebElement middleText = driver.findElement(By.id("content"));
        String actualText = middleText.getText();
        String expectedText = "MIDDLE";
        Assert.assertEquals(actualText, expectedText);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.tagName("body"));

        Assert.assertEquals(bottom.getText().trim(), "BOTTOM");


    }

    @Test
    public void printRightAndLeft (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        WebElement print = driver.findElement(By.id("body"));
        String allText = print.getText();
        

    }
}
