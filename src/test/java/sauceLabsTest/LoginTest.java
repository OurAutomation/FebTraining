package sauceLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    public void init() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void validateUsernameInputBox() {
        WebElement usernameInputBox = driver.findElement(By.name("user-name"));
        Assert.assertTrue(usernameInputBox.isDisplayed());
        String type = usernameInputBox.getAttribute("type");
//        Assert.assertNotEquals(type,"password");
        Assert.assertEquals(type,"text");
    }

    @Test
    public void validatePasswordInputBox() {
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        Assert.assertTrue(passwordInputBox.isDisplayed());
    }

    @Test
    public void validatePasswordInputBoxIsGettingMasked() {
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        String type = passwordInputBox.getAttribute("type");
        Assert.assertEquals(type,"password");
    }

    @Test
    public void validateNumberOfInputBoxes() {
        List<WebElement> inputBoxes = driver.findElements(By.tagName("input"));
        Assert.assertEquals(inputBoxes.size(),3);
    }

    @Test
    public void validateColourOfSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("login-button"));
        String backgroundColor = submitButton.getCssValue("background-color");
        Assert.assertEquals(backgroundColor,"rgba(61, 220, 145, 1)");
    }

    @Test(priority = 1)
    public void validateLoginFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(By.name("user-name")).clear();
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String title = driver.findElement(By.className("app_logo")).getText();
        softAssert.assertEquals(title,"Swag labs");
        softAssert.assertEquals(driver.findElement(By.className("shopping_cart_container")).isDisplayed(),
                true);
        softAssert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
