package sauceLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest {
    WebDriver driver;
    @Test
    public void validateUsernameInputBox() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement usernameInputBox = driver.findElement(By.name("user-name"));
        Assert.assertTrue(usernameInputBox.isDisplayed());
    }

    @Test
    public void validatePasswordInputBox() {
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        Assert.assertTrue(passwordInputBox.isDisplayed());
    }

    @Test
    public void validateNumberOfInputBoxes() {
        List<WebElement> inputBoxes = driver.findElements(By.tagName("input"));
        Assert.assertEquals(inputBoxes.size(),3);
    }
}
