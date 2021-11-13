package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHere = driver.findElement(By.xpath("//a[.=\'Click Here\']"));
        clickHere.click();

        String mainWindowID = driver.getWindowHandle(); //123
        Set<String> ids = driver.getWindowHandles(); //123 - 124

        for (String id : ids){
            System.out.println(id);
            if(!id.equals(mainWindowID)){
                driver.switchTo().window(id);
            }

        }



        WebElement newWindow = driver.findElement(By.xpath("//h3[.=\'New Window\']"));
        String actualText = newWindow.getText();
        String experctedText = "New Window";
        Assert.assertEquals(actualText, experctedText, "Window validation");

        driver.quit(); // closes all the windows // driver.close -- one last page




    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHere = driver.findElement(By.xpath("//a[.=\'Click Here\']"));
        clickHere.click();

        String mainWindowID = driver.getWindowHandle(); //123
        Set<String> ids = driver.getWindowHandles();
        for(String id:ids){
            if(!id.equals(mainWindowID)){
                driver.switchTo().window(id);
                driver.close(); // close only one window
            }
        }
      /*  driver.switchTo(mainWindowID);
        Assert.assertEquals(new String[]{driver.getTitle()});*/


    }
}
