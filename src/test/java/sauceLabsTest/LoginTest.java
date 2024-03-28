package sauceLabsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
        Assert.assertEquals(type, "text");
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
        Assert.assertEquals(type, "password");
    }

    @Test
    public void validateNumberOfInputBoxes() {
        List<WebElement> inputBoxes = driver.findElements(By.tagName("input"));
        Assert.assertEquals(inputBoxes.size(), 3);
        inputBoxes = driver.findElements(By.cssSelector("input:not([type='submit'])"));
        Assert.assertEquals(inputBoxes.size(), 2);
    }

    @Test
    public void validateSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("login-button"));
        boolean enabled = submitButton.isEnabled();
        System.out.println("Submit button enabled :: " + enabled);
        String backgroundColor = submitButton.getCssValue("background-color");
        Assert.assertEquals(backgroundColor, "rgba(61, 220, 145, 1)");
    }

    @Test(priority = 1)
    public void validateLoginFunctionality() {
        //nosuch element exception
        SoftAssert softAssert = new SoftAssert();
//        driver.findElement(By.className("input_error form_input")).clear(); org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String title = driver.findElement(By.className("app_logo")).getText();
        softAssert.assertEquals(title, "Swag labs");
        softAssert.assertEquals(driver.findElement(By.className("shopping_cart_container")).isDisplayed(),
                true);
        softAssert.assertTrue(driver.findElement(By.className("title")).isDisplayed());
        softAssert.assertAll();
    }


    @Test(priority = 2)
    public void validateDefaultSelectedOptionInFilter() {
        WebElement filterLoc = driver.findElement(By.cssSelector(".product_sort_container"));
        Select filterOption = new Select(filterLoc);
        WebElement firstSelectedOption = filterOption.getFirstSelectedOption();
        Assert.assertEquals(firstSelectedOption.getText(), "Name (A to Z)");
        List<WebElement> allSelectedOptions = filterOption.getAllSelectedOptions();
    }

    @Test(priority = 2)
    public void validateAllOptionsInFilter() {
        WebElement filterLoc = driver.findElement(By.cssSelector(".product_sort_container"));
        Select filterOption = new Select(filterLoc);
        List<WebElement> options = filterOption.getOptions();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(options.size(), 3,"Number of options in filter dropdown is not matching");
        softAssert.assertEquals(options.get(0).getText(), "Name (A to Z)");
        softAssert.assertEquals(options.get(1).getText(), "Name (Z to A)");
        softAssert.assertEquals(options.get(2).getText(), "Price (low to hig)", "Third option text is not matching");
        softAssert.assertEquals(options.get(3).getText(), "Price (high to low)");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void selectOptionInFilter() {
        WebElement filterLoc = driver.findElement(By.cssSelector(".product_sort_container"));
        Select filterOption = new Select(filterLoc);
        filterOption.selectByVisibleText("Name (Z to A)");
        System.out.println("Filter selected by visible text");
        filterOption = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
        filterOption.selectByIndex(2);
        System.out.println("Filter selected by index");
        filterOption = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
        filterOption.selectByValue("hilo");
        System.out.println("Filter selected by value");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
