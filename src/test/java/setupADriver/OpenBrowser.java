package setupADriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenBrowser {
    String PROJECT_HOME = System.getProperty("user.dir");
    WebDriver driver;

    @Test(priority = 0)
    public void openChromeBrowser() throws InterruptedException {
        //Webdriver -- All the browser related functions will be defined here
        //ChromeDriver = it will open a chrome driver
        //EdgeDriver = it will open a edge driver
        System.out.println("This is a testng method");
        /*System.setProperty("webdriver.chrome.driver", PROJECT_HOME + File.separator + "Drivers" + File.separator
                + "chromedriver.exe");*/
        driver = new ChromeDriver();//it will open a chrome browser
        driver.manage().window().maximize();// to maximize the window
//        driver.manage().window().minimize();// to minimize the window
    }

    @Test(priority = 1, description = "navigating to facebook application")
    public void navigateToApplication() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
    }

    @Test(priority = 1, description = "Discussed about navigate commands")
    public void navigateUCommands() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        driver.navigate().back();//To navigate backwards
        driver.navigate().forward();//To navigate forward
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().refresh();//refresh the page
    }


    @Test(priority = 2, description = "Validated the title of the page is matching with the expected")
    public void validateTitleOfThePage() {
        String title = driver.getTitle();
        System.out.println("Title of the page is :: " + title);
        Assert.assertEquals(title, "Facebook – log in or sign");
    }

    @Test(priority = 3)
    public void validateTheCurrentURL() {
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current url is :: " + currentURL);
        Assert.assertEquals(currentURL, "https://www.facebook.com/");
    }

    @Test(priority = 4)
    public void openNewTab() throws InterruptedException {
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void openNewWindow() throws InterruptedException {
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
    }

    @Test(priority = 2 ^ 32 - 1)
    public void closeTheBrowser() {
//        driver.close();// It will close only the current tab
        driver.quit();//Will close all the tabs and windows
//        driver.get("https://youtube.com");//will throw an NoSuchSessionException exception
//        Assert.fail();
    }

    @Test(enabled = false)
    public void openEdgeBrowser() {
        System.out.println("This is a edge browser");
        WebDriver driver = new EdgeDriver();
        driver.close();
//        driver = new SafariDriver();
    }
}
