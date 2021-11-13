package SeleniumMentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1GoDaddy {
  /*  Assignment Level - Beginner
    Test Case 1 - Open Godaddy.com and maximize browser window.
    Steps to Automate:
            1. Launch browser of your choice say., Firefox, chrome etc.
            2. Open this URL - https://www.godaddy.com/
            3. Maximize or set size of browser window.
4. Close browser. */
  public static void main(String[] args) throws InterruptedException {
      // What is the function of WEBDriver?
      // Webdriver is a way of manipulating ( changing) the web browser
      //What is firefox driver?
      // Firefox driver is Gecko driver

      WebDriver driver = new ChromeDriver();
     // driver.get("https://www.godaddy.com/");
     // driver.get(); // it waits for all elements to be loaded on the website
      // Get doesnt have methods
      driver.navigate().to("https://www.godaddy.com/"); // it will wait for the specific element that you are looking for
      // also it has some methods like ( FORWARD< REFRESH, BACK... )

      //Close will close the current web browser(tab)
      //Quit will close the driver (it means all of the web browsers(tabs)

      //Suggestion: if you put all the elements locations correct and still they are not working. Make the web browser full screen
      //** Suggestion: Put the thread.sleep(3000)


      driver.manage().window().maximize();
      Thread.sleep(3000);
      driver.close();


  }
}
