package SeleniumMentoringAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookCreate {
    public static void main(String[] args) throws InterruptedException {


   /* Facebook Sign up:
    Scenario:
    Open a Chrome browser.
    Navigate to "http://www.fb.com"
    Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
    Verify that there is a "Create an account" section on the page.
    Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
    Update the date of birth in the drop-down.
    Select gender.
    Click on "Create an account".
    Verify that the account is not created. */
        //Suggestion:
        //
   WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
       // Assert.assertEquals();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.facebook.com/","it is validated");
        WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        create.click();
        Thread.sleep(4000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Ahmet");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Baldi");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("Baldi@gmail.com");
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Yo!yo!Yo2021");
        WebElement month = driver.findElement(By.name("month"));
        month.sendKeys("Aug");
        WebElement day = driver.findElement(By.name("day"));
        day.sendKeys("20");
        WebElement year = driver.findElement(By.name("year"));
        year.sendKeys("2020");
        WebElement gender = driver.findElement(By.xpath("//label[contains(text().'Male)]"));
        gender.click();

        driver.findElement(By.name("websubmit"));



}}
