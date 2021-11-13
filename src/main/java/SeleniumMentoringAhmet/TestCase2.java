package SeleniumMentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) {
        /*Test Case 2 - Open Godaddy.com and Print it's Page title.
Steps to Automate:
1. Launch browser of your choice say., Firefox, chrome etc.
2. Open this URL - https://www.godaddy.com/
3. Maximize or set size of browser window.
4. Get Title of page and print it.
4. Get URL of current page and print it.
5. Close browser.

Now is the time to automate a consolidated and final assignment.*/

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.godaddy.com/");

        // what is driver and element method?
        //WebElement element = driver.findElement()
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
